package br.com.mastertech.bond.repository;

import br.com.mastertech.bond.entity.Bond;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BondRepository extends CrudRepository<Bond, Integer> {
    Optional<Bond> findByKeyPix(String key);

    Optional<Bond> findByKeyPixAndKeyType(String keyPix, String keyType);

    List<Bond> findByOwnerTaxIdNumber(String cpf);
}
