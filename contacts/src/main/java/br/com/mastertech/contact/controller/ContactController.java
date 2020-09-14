package br.com.mastertech.contact.controller;

import br.com.mastertech.contact.mapper.ContactMapper;
import br.com.mastertech.contact.model.Contact;
import br.com.mastertech.contact.model.ContactRequest;
import br.com.mastertech.contact.model.ContactUpdateRequest;
import br.com.mastertech.contact.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping()
public class ContactController
{
    @Autowired
    ContactService contactService;

    @Autowired
    ContactMapper mapper;


    @PostMapping("/contact")
    @ResponseStatus(HttpStatus.CREATED)
    public Contact criar(@RequestBody @Valid ContactRequest contact)
    {
        return  contactService.criar(mapper.from(contact));
    }

    @GetMapping("/contact/{id}")
    public Contact buscarPorId(@PathVariable(name = "id") Long id)
    {

        return contactService.buscarPorId(id);
    }

    @DeleteMapping(value = "/contact/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteContact (@PathVariable Long id) {
        deleteContact(id);
    }

    @PatchMapping("/contact")
    public Contact updateContact(@RequestBody @Valid ContactUpdateRequest contact){
        return contactService.update(mapper.fromUpdate(contact));
    }

    @GetMapping("/contacts/{id}")
    public List<Contact> getContacts(@PathVariable Long id){
        return contactService.getContatos(id);
    }


}


