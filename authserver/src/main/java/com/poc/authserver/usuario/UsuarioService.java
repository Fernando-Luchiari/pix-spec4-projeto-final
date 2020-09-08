package com.poc.authserver.usuario;

import java.util.Collections;
import java.util.Optional;

import javax.annotation.PostConstruct;

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
  private UsuarioRepository repository;
  
  @PostConstruct
  public void popular() {
    Usuario usuario = new Usuario();
    usuario.setNome("nicao");
    usuario.setSenha(encoder.encode("nicao123"));
    repository.save(usuario);

    Usuario alanGarcia = new Usuario();
    alanGarcia.setNome("alan-garcia");
    alanGarcia.setSenha(encoder.encode("alan-garcia123"));
    repository.save(alanGarcia);

    Usuario alexFroide = new Usuario();
    alexFroide.setNome("alex-froide");
    alexFroide.setSenha(encoder.encode("alex-froide123"));
    repository.save(alexFroide);

    Usuario alexHerrera = new Usuario();
    alexHerrera.setNome("alex-herrera");
    alexHerrera.setSenha(encoder.encode("alex-herrera123"));
    repository.save(alexHerrera);

    Usuario anaCristina = new Usuario();
    anaCristina.setNome("ana-cristina");
    anaCristina.setSenha(encoder.encode("ana-cristina123"));
    repository.save(anaCristina);

    Usuario andersonFiuza = new Usuario();
    andersonFiuza.setNome("anderson-fiuza");
    andersonFiuza.setSenha(encoder.encode("anderson-fiuza123"));
    repository.save(andersonFiuza);

    Usuario andreLuis = new Usuario();
    andreLuis.setNome("andre-luis");
    andreLuis.setSenha(encoder.encode("andre-luis123"));
    repository.save(andreLuis);

    Usuario ayrtonSaito = new Usuario();
    ayrtonSaito.setNome("ayrton-saito");
    ayrtonSaito.setSenha(encoder.encode("ayrton-saito123"));
    repository.save(ayrtonSaito);

    Usuario brunoHenrique = new Usuario();
    brunoHenrique.setNome("bruno-henrique");
    brunoHenrique.setSenha(encoder.encode("bruno-henrique123"));
    repository.save(brunoHenrique);

    Usuario brunoManoel = new Usuario();
    brunoManoel.setNome("bruno-manoel");
    brunoManoel.setSenha(encoder.encode("bruno-manoel123"));
    repository.save(brunoManoel);

    Usuario carlosEduardo = new Usuario();
    carlosEduardo.setNome("carlos-eduardo");
    carlosEduardo.setSenha(encoder.encode("carlos-eduardo123"));
    repository.save(carlosEduardo);

    Usuario clebersonSoares = new Usuario();
    clebersonSoares.setNome("cleberson-soares");
    clebersonSoares.setSenha(encoder.encode("cleberson-soares123"));
    repository.save(clebersonSoares);

    Usuario fabianaHisako = new Usuario();
    fabianaHisako.setNome("fabiana-hisako");
    fabianaHisako.setSenha(encoder.encode("fabiana-hisako123"));
    repository.save(fabianaHisako);

    Usuario felipeGabriel = new Usuario();
    felipeGabriel.setNome("felipe-gabriel");
    felipeGabriel.setSenha(encoder.encode("felipe-gabriel123"));
    repository.save(felipeGabriel);

    Usuario fernandoLuchiari = new Usuario();
    fernandoLuchiari.setNome("fernando-luchiari");
    fernandoLuchiari.setSenha(encoder.encode("fernando-luchiari123"));
    repository.save(fernandoLuchiari);

    Usuario gabrielaMota = new Usuario();
    gabrielaMota.setNome("gabriela-mota");
    gabrielaMota.setSenha(encoder.encode("gabriela-mota123"));
    repository.save(gabrielaMota);

    Usuario guilhermeCabral = new Usuario();
    guilhermeCabral.setNome("guilherme-cabral");
    guilhermeCabral.setSenha(encoder.encode("guilherme-cabral123"));
    repository.save(guilhermeCabral);

    Usuario jeremiasPak = new Usuario();
    jeremiasPak.setNome("jeremias-pak");
    jeremiasPak.setSenha(encoder.encode("jeremias-pak123"));
    repository.save(jeremiasPak);

    Usuario leonardoAndrade = new Usuario();
    leonardoAndrade.setNome("leonardo-andrade");
    leonardoAndrade.setSenha(encoder.encode("leonardo-andrade123"));
    repository.save(leonardoAndrade);

    Usuario lucasDefante = new Usuario();
    lucasDefante.setNome("lucas-defante");
    lucasDefante.setSenha(encoder.encode("lucas-defante123"));
    repository.save(lucasDefante);

    Usuario marceloLuiz = new Usuario();
    marceloLuiz.setNome("marcelo-luiz");
    marceloLuiz.setSenha(encoder.encode("marcelo-luiz123"));
    repository.save(marceloLuiz);

    Usuario marceloYugo = new Usuario();
    marceloYugo.setNome("marcelo-yugo");
    marceloYugo.setSenha(encoder.encode("marcelo-yugo123"));
    repository.save(marceloYugo);

    Usuario mariaSinesia = new Usuario();
    mariaSinesia.setNome("maria-sinesia");
    mariaSinesia.setSenha(encoder.encode("maria-sinesia123"));
    repository.save(mariaSinesia);

    Usuario marioHenrique = new Usuario();
    marioHenrique.setNome("mario-henrique");
    marioHenrique.setSenha(encoder.encode("mario-henrique123"));
    repository.save(marioHenrique);

    Usuario mateusAffonso = new Usuario();
    mateusAffonso.setNome("mateus-affonso");
    mateusAffonso.setSenha(encoder.encode("mateus-affonso123"));
    repository.save(mateusAffonso);

    Usuario mauricioMuniz = new Usuario();
    mauricioMuniz.setNome("mauricio-muniz");
    mauricioMuniz.setSenha(encoder.encode("mauricio-muniz123"));
    repository.save(mauricioMuniz);

    Usuario palomaCristina = new Usuario();
    palomaCristina.setNome("paloma-cristina");
    palomaCristina.setSenha(encoder.encode("paloma-cristina123"));
    repository.save(palomaCristina);

    Usuario patriciaSantos = new Usuario();
    patriciaSantos.setNome("patricia-santos");
    patriciaSantos.setSenha(encoder.encode("patricia-santos123"));
    repository.save(patriciaSantos);

    Usuario rafaelRossi = new Usuario();
    rafaelRossi.setNome("rafael-rossi");
    rafaelRossi.setSenha(encoder.encode("rafael-rossi123"));
    repository.save(rafaelRossi);

    Usuario renatoPrata = new Usuario();
    renatoPrata.setNome("renato-prata");
    renatoPrata.setSenha(encoder.encode("renato-prata123"));
    repository.save(renatoPrata);

    Usuario ricardoSanches = new Usuario();
    ricardoSanches.setNome("ricardo-sanches");
    ricardoSanches.setSenha(encoder.encode("ricardo-sanches123"));
    repository.save(ricardoSanches);

    Usuario richardsonRamiro = new Usuario();
    richardsonRamiro.setNome("richardson-ramiro");
    richardsonRamiro.setSenha(encoder.encode("richardson-ramiro123"));
    repository.save(richardsonRamiro);

    Usuario rodrigoSampaio = new Usuario();
    rodrigoSampaio.setNome("rodrigo-sampaio");
    rodrigoSampaio.setSenha(encoder.encode("rodrigo-sampaio123"));
    repository.save(rodrigoSampaio);

    Usuario rogerioAvila = new Usuario();
    rogerioAvila.setNome("rogerio-avila");
    rogerioAvila.setSenha(encoder.encode("rogerio-avila123"));
    repository.save(rogerioAvila);

    Usuario ronaldoSoares = new Usuario();
    ronaldoSoares.setNome("ronaldo-soares");
    ronaldoSoares.setSenha(encoder.encode("ronaldo-soares123"));
    repository.save(ronaldoSoares);

    Usuario samuelSilva = new Usuario();
    samuelSilva.setNome("samuel-silva");
    samuelSilva.setSenha(encoder.encode("samuel-silva123"));
    repository.save(samuelSilva);

    Usuario thaisMara = new Usuario();
    thaisMara.setNome("thais-mara");
    thaisMara.setSenha(encoder.encode("thais-mara123"));
    repository.save(thaisMara);

    Usuario thiagoCardoso = new Usuario();
    thiagoCardoso.setNome("thiago-cardoso");
    thiagoCardoso.setSenha(encoder.encode("thiago-cardoso123"));
    repository.save(thiagoCardoso);

    Usuario viniciusFermino = new Usuario();
    viniciusFermino.setNome("vinicius-fermino");
    viniciusFermino.setSenha(encoder.encode("vinicius-fermino123"));
    repository.save(viniciusFermino);

  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<Usuario> optional = repository.findByNome(username);
    
    if(!optional.isPresent()) {
      throw new UsernameNotFoundException("Usuário não encontrado");
    }
    
    Usuario usuario = optional.get();
    
    SimpleGrantedAuthority authority = new SimpleGrantedAuthority("user");
    
    return new User(usuario.getNome(), usuario.getSenha(), Collections.singletonList(authority));
  }
}
