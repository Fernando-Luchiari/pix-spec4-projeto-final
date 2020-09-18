package br.com.mastertech.transaction.configuration;

import br.com.mastertech.transaction.decoder.BondClientDecoder;
import br.com.mastertech.transaction.model.BondClientFallback;
import feign.Feign;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import io.github.resilience4j.feign.FeignDecorators;
import io.github.resilience4j.feign.Resilience4jFeign;
import org.springframework.context.annotation.Bean;

public class BondClientConfiguration {

    @Bean
    public ErrorDecoder getCardClientDecoder(){
        return new BondClientDecoder();
    }

    @Bean
    public Feign.Builder builder(){
        FeignDecorators decoratos = FeignDecorators.builder()
                .withFallback(new BondClientFallback(), RetryableException.class)
                .build();

        return Resilience4jFeign.builder(decoratos);
    }

}
