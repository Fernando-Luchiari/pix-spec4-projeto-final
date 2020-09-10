package br.com.mastertech.transaction.controller;

import br.com.mastertech.transaction.model.DocumentRequest;
import br.com.mastertech.transaction.model.DocumentResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/document")
public class DocumentController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public DocumentResponse createDocument(@RequestBody @Valid DocumentRequest request){
        return null;
    }
}
