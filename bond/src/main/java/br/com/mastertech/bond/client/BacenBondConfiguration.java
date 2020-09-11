//package br.com.mastertech.bond.client;
//
//import feign.Feign;
//import feign.RequestInterceptor;
//import feign.RetryableException;
//import feign.codec.ErrorDecoder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.oauth2.client.OAuth2ClientContext;
//import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
//
//public class BacenBondConfiguration {
//
//    @Autowired
//    private OAuth2ClientContext clientContext;
//
//    @Autowired
//    private ClientCredentialsResourceDetails clientCredentialsResourceDetails;
//
//    @Bean
//    public RequestInterceptor oauth2FeignRequestInterceptor() {
//        return new OAuth2FeignRequestInterceptor(clientContext, clientCredentialsResourceDetails);
//    }
//
//    @Bean
//    public ErrorDecoder getClientCardDecoder() {
//        return new BacenBondDecoder();
//    }
//
////    @Bean
////    public Feign.Builder builder() {
////        FeignDecorators decorators = FeignDecorators.builder()
//////                .withFallback(new ClientCardFallback(), RetryableException.class)
//////                .withFallbackFactory(ClientCardLoadBalancerFallback::new, RuntimeException.class)
////                .build();
////
////        return Resilience4jFeign.builder(decorators);
////    }
//}
