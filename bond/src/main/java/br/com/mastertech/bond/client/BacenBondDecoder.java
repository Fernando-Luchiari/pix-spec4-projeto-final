//package br.com.mastertech.bond.client;
//
//import feign.Response;
//import feign.codec.ErrorDecoder;
//
//public class BacenBondDecoder implements ErrorDecoder {
//
//    private ErrorDecoder errorDecoder = new Default();
//
//    @Override
//    public Exception decode(String s, Response response) {
//        if(response.status() == 400) {
//            return new BondNotFoundException();
//        }
//        return errorDecoder.decode(s, response);
//    }
//}
