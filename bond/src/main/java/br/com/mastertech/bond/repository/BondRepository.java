package br.com.mastertech.bond.repository;

import br.com.mastertech.bond.entity.BondEntity;
import org.springframework.data.repository.CrudRepository;

public interface BondRepository extends CrudRepository<BondEntity, Integer> {
}
