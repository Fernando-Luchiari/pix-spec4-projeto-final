package br.com.mastertech.transaction.service;



import br.com.mastertech.transaction.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DocumentProducer {

    @Autowired
    private KafkaTemplate<String, Document> producer;

    public void enviarAoKafka(Document dados) {

        producer.send("spec4-gp3-pix", dados);

    }

}