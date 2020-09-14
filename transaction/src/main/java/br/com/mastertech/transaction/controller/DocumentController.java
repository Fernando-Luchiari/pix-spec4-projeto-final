package br.com.mastertech.transaction.controller;

import br.com.mastertech.transaction.entity.Document;
import br.com.mastertech.transaction.exception.BondNotFoundException;
import br.com.mastertech.transaction.mapper.TransactionMapper;
import br.com.mastertech.transaction.model.*;
import br.com.mastertech.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private TransactionMapper mapper;
    @Autowired
    private TransactionService service;
    @Autowired
    private BondClient bond;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public DocumentResponse createDocument(@RequestBody @Valid DocumentRequest request){
        if (bond.verifyBond(request.getChave())) {
            Document document = service.create(mapper.requestToEntity(request));
            return mapper.entityToResponse(document);
        } else {
            throw new BondNotFoundException();
        }

    }

    @GetMapping(value = "/{cpf}")
    public List<DocumentResponseCustomer> getDocumentList(@PathVariable String cpf) {
        List<Document> listDocument = service.getListDocument(cpf);
        return listDocument
                .stream()
                .map(document -> mapper.entityToResponseList(document))
                .collect(Collectors.toList());
    }

    @GetMapping(value = "/txid/{txid}")
    public DocumentResponseCustomer getDocument(@PathVariable String txid) {
        Document document = service.getDocument(txid);
        return mapper.entityToResponseList(document);
    }

    @PatchMapping(value = "/{txid}")
    public DocumentResponseCustomer updateDocument(@PathVariable String txid, @RequestBody DocumentUpdateRequest request) {
        Document document = service.updateDocument(txid, request);
        return mapper.entityToResponseList(document);
    }

    @DeleteMapping(value = "/{txid}")
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteDocument(@PathVariable String txid) {
        service.deleteDocument(txid);
    }

    @GetMapping(value = "/chave/{chave}")
    public List<DocumentResponseCustomer> getChave(@PathVariable String chave) {
        List<Document> listDoc = service.getChave(chave);
        return listDoc.stream()
                .map(document -> mapper.entityToResponseList(document))
                .collect(Collectors.toList());
    }

}
