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

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        //bond.setRequestId(stringHexa(gerarHash(bond.getOwner().getName(), "MD5")));
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

    public static byte[] gerarHash(String frase, String algoritmo) {
        try {
            MessageDigest md = MessageDigest.getInstance(algoritmo);
            md.update(frase.getBytes());
            return md.digest();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String stringHexa(byte[] bytes) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int parteAlta = ((bytes[i] >> 4) & 0xf) << 4;
            int parteBaixa = bytes[i] & 0xf;
            if (parteAlta == 0) s.append('0');
            s.append(Integer.toHexString(parteAlta | parteBaixa));
        }
        return s.toString();
    }

//    public void updateBond(Bond bond) {
//    }

//    public void deleteBond() {
//    }
}
