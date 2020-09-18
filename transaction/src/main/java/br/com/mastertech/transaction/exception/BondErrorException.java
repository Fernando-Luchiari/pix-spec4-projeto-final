package br.com.mastertech.transaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.GATEWAY_TIMEOUT, reason = "Aplicação fora!!")
public class BondErrorException extends RuntimeException {
}
