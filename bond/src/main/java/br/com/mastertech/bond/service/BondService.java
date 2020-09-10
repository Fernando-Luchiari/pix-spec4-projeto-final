package br.com.mastertech.bond.service;

import br.com.mastertech.bond.entity.Bond;
import br.com.mastertech.bond.exceptions.BondNotFoundException;
import br.com.mastertech.bond.model.BondRequest;
import br.com.mastertech.bond.model.BondResponseGet;
import br.com.mastertech.bond.model.BondResponsePost;
import br.com.mastertech.bond.repository.BondRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class BondService {

//    @Autowired
//    private BacenBond bacenBond;

    @Autowired
    private BondRepository bondRepository;

    public Bond createBond(Bond bond) {
        bond.setCreationDate(LocalDateTime.now());
        bond.setKeyOwnershipDate(LocalDateTime.now());
        return bondRepository.save(bond);
    }

    public Bond getBond(String key) {
        Optional<Bond> bondOptional = bondRepository.findByKeyPix(key);
        Bond bond = new Bond();
        if (bondOptional.isPresent()) {
            bond = bondOptional.get();
            return bond;
        } else {
            throw new BondNotFoundException();
        }
    }

//    public void updateBond(Bond bond) {
//    }

//    public void deleteBond() {
//    }
}
