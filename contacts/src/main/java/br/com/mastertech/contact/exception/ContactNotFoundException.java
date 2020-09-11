package br.com.mastertech.contact.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason = "Contato não encontrado")
public class ContactNotFoundException extends RuntimeException {
}
