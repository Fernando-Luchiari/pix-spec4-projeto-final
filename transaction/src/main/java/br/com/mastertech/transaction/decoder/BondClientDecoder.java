package br.com.mastertech.transaction.decoder;

import br.com.mastertech.transaction.exception.BondNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class BondClientDecoder implements ErrorDecoder{

    private ErrorDecoder errorDecoder = new Default();


    @Override
    public Exception decode(String s, Response response) {
        if(response.status() == 404) {
            return new BondNotFoundException();
        }
        return errorDecoder.decode(s, response);
    }

}
