package br.com.mastertech.authserver.usuario;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.com.mastertech.authserver.entity.Customer;
import br.com.mastertech.authserver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

  @Autowired
  private CustomerRepository usuarioRepository;

  @GetMapping("/me")
  public Map<String, Object> validar(Principal principal) {
    Optional<Customer> optional = usuarioRepository.findByEmail(principal.getName());

    Map<String, Object> map = new HashMap<>();
    map.put("name", principal.getName());
    if(optional.isPresent()) {
      map.put("id", optional.get().getId());
    }else{
      map.put("id", 0);
    }
    return map;
  }
}
