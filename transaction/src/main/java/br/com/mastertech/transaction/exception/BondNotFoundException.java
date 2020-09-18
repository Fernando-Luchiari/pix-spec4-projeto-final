package br.com.mastertech.transaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Vinculo não encontrado")
public class BondNotFoundException extends RuntimeException {
}
