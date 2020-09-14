package br.com.mastertech.bond.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Vínculo já cadastrado")
public class BondExceptionJaExiste extends RuntimeException {
}
