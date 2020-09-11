package br.com.mastertech.authserver.usuario;

import java.util.Collections;
import java.util.Optional;

import javax.annotation.PostConstruct;

import br.com.mastertech.authserver.entity.Customer;
import br.com.mastertech.authserver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {
  @Autowired
  private BCryptPasswordEncoder encoder;
  
  @Autowired
  private CustomerRepository repository;
  


  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<Customer> optional = repository.findByEmail(email);
    
    if(!optional.isPresent()) {
      throw new UsernameNotFoundException("Usuário não encontrado");
    }

    Customer usuario = optional.get();
    usuario.setPassword(encoder.encode(usuario.getPassword()));
    repository.save(usuario);

    
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority("user");
    
    return new User(usuario.getEmail(), usuario.getPassword(), Collections.singletonList(authority));
  }
}
