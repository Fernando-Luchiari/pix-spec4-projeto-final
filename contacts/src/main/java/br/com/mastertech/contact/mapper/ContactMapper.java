package br.com.mastertech.contact.mapper;

import br.com.mastertech.contact.model.Contact;
import br.com.mastertech.contact.model.ContactRequest;
import br.com.mastertech.contact.model.ContactUpdateRequest;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {
    public Contact from(ContactRequest request){
        Contact contact = new Contact();
        contact.setIdCustomer(request.getIdCustomer());
        contact.setNickName(request.getNickName());
        contact.setKeyPix(request.getKeyPix());
        return contact;
    }

    public Contact fromUpdate(ContactUpdateRequest request){
        Contact contact = new Contact();
        contact.setId(request.getId());
        contact.setNickName(request.getNickName());
        contact.setKeyPix(request.getKeyPix());
        return contact;
    }
}
