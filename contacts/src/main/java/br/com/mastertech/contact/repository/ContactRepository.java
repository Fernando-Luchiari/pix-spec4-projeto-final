package br.com.mastertech.contact.repository;

import br.com.mastertech.contact.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long > {
}

