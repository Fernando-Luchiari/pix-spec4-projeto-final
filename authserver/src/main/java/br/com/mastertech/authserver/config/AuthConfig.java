package br.com.mastertech.authserver.config;

import br.com.mastertech.authserver.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
@EnableAuthorizationServer
public class AuthConfig extends AuthorizationServerConfigurerAdapter{

  @Autowired
  private BCryptPasswordEncoder encoder;
  
  @Autowired
  private AuthenticationManager manager;
  
  @Autowired
  private UsuarioService usuarioService;
  
  @Override
  public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
    clients.inMemory()
     .withClient("projPixSpec4")
     .secret(encoder.encode("pix"))
     .authorizedGrantTypes("check_token", "password", "refresh_token")
     .scopes("all")
     .and()
     .withClient("apiprojPixSpec4")
      .secret(encoder.encode("apipix"))
      .authorizedGrantTypes("check_token", "password", "refresh_token")
      .scopes("all");
  }
  
  @Override
  public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
    endpoints.authenticationManager(manager).userDetailsService(usuarioService);
  }
}
