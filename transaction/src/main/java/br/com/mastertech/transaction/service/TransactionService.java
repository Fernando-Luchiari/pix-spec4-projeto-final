package br.com.mastertech.transaction.service;

import br.com.mastertech.transaction.entity.Document;
import br.com.mastertech.transaction.model.DocumentUpdateRequest;
import br.com.mastertech.transaction.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    @Autowired
    private DocumentProducer producer;

    public Document create(Document data) {
        Document doc = repository.save(data);
        if(doc != null){
            producer.enviarAoKafka(doc);
        }
        return doc;
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

    @Transactional
    public void deleteDocument(String txid) {
        repository.deleteByTxid(txid);
    }

    public List<Document> getChave(String chave) {
        return repository.findByChave(chave);
    }
}
