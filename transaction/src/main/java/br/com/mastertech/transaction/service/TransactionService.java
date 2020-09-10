package br.com.mastertech.transaction.service;

import br.com.mastertech.transaction.entity.Document;
import br.com.mastertech.transaction.entity.InfoAdicionais;
import br.com.mastertech.transaction.model.DocumentUpdateRequest;
import br.com.mastertech.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public Document create(Document data) {
        return repository.save(data);
    }

    public List<Document> getListDocument(String cpf) {
        return repository.findAllByCpfPagador(cpf);
    }

    public Document getDocument(String txid) {
        return repository.findByTxid(txid);
    }

    public Document updateDocument(String txid, DocumentUpdateRequest request) {
        Document byTxid = repository.findByTxid(txid);
        byTxid.setSolicitacaoPagador(request.getSolicitacaoPagador());
        return repository.save(byTxid);
    }
}
