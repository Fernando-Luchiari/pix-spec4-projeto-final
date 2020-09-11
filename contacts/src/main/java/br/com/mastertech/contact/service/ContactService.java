package br.com.mastertech.contact.service;


import br.com.mastertech.contact.exception.ContactNotFoundException;
import br.com.mastertech.contact.model.Contact;
import br.com.mastertech.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContactService
{
    @Autowired
    private ContactRepository contactRepository;

    //*** Criar novo contato
    public Contact criar (Contact contact)
    {
        System.out.println(System.currentTimeMillis() + " - Criaram um novo contato " + contact.getNickName());
        return  contactRepository.save(contact);
    }

    //*** Busca por ID
    public Contact buscarPorId(Long id)
    {
        System.out.println(System.currentTimeMillis() + " - Buscaram um contato " + id);
        Optional<Contact> contactOptional = contactRepository.findById(id);

        if(contactOptional.isPresent())
        {
            Contact contact = contactOptional.get();
            return  contact;
        }
        else
        {
            throw new ContactNotFoundException();
        }
    }
    //*** Deletar
    public void deleteContact (Long id) {
        System.out.println(System.currentTimeMillis() + " - Deletar um contato " + id);
        Optional<Contact> byId = contactRepository.findById(id);
        if (byId.isPresent()) {
            contactRepository.delete(byId.get());
        } else
            throw new ContactNotFoundException();
    }
}
