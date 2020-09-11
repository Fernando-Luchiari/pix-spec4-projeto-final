package br.com.mastertech.contact.controller;

import br.com.mastertech.contact.model.Contact;
import br.com.mastertech.contact.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/contact")
public class ContactController
{
    @Autowired
    ContactService contactService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Contact criar(@RequestBody @Valid Contact contact)
    {

        return  contactService.criar(contact);
    }

    @GetMapping("/{id}")
    public Contact buscarPorId(@PathVariable(name = "id") Long id)
    {

        return contactService.buscarPorId(id);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus (HttpStatus.NO_CONTENT)
    public void deleteContact (@PathVariable Long id) {
        deleteContact(id);
    }

}


