package br.com.mastertech.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "E-mail ou senha incorretos")
public class UserOrPasswordWrongException extends RuntimeException {
}
