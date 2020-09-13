package br.com.mastertech.customer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceConfig extends ResourceServerConfigurerAdapter{

  private static final String[] PUBLIC_ENDPOINTS_POST = {
          "/contact",
          "/login"
  };

  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers(HttpMethod.POST, PUBLIC_ENDPOINTS_POST)
            .permitAll()
            .anyRequest()
            .authenticated();
  }
}
