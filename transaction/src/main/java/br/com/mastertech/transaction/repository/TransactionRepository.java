package br.com.mastertech.transaction.repository;

import br.com.mastertech.transaction.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Document, Long> {
    Document findByTxid(String txid);

    List<Document> findAllByCpfPagador(String cpf);

    void deleteByTxid(String txid);
}
