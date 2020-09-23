package br.com.mastertech.notification.consumer;

import br.com.mastertech.notification.clients.CustomerClients.Customer;
import br.com.mastertech.notification.clients.CustomerClients.CustomerClient;
import br.com.mastertech.notification.services.MailService;
import br.com.mastertech.notification.services.SmsService;
import br.com.mastertech.transaction.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TransactionEventConsumer {

    @Autowired
    private CustomerClient customerClient;

    @Autowired
    private MailService mailService;

    @Autowired
    private SmsService smsService;

    @KafkaListener(topics = "spec4-gp3-pix", groupId = "transaction notify")
    public void receber(@Payload Document documentEvent) throws IOException{
        Customer customer = getCustomerData(documentEvent.getCpfPagador());
        String mensagem = montaMensagemCurta(documentEvent,customer);
//        pixBot(transactionEvent.toString() + customer.getPhoneNumber());
        smsService.sendSMS(customer, mensagem);
        mailService.sendMail(mensagem, customer);
    }

    private Customer getCustomerData(Long id) throws IOException
    {
        return customerClient.getCustomerById(id);
    }

    private Customer getCustomerData(String cpf) throws IOException
    {
        return customerClient.getCustomerByCpf(cpf);
    }

    public String montaMensagemCurta(Document documentEvent,Customer customer){

        StringBuilder mensagem = new StringBuilder();

        mensagem.append("Informe PIX: \n");
        mensagem.append(customer.getName());
        mensagem.append(" realizou um pagamento de R$");
        mensagem.append(documentEvent.getValor());
        mensagem.append(" por ");
        mensagem.append(documentEvent.getSolicitacaoPagador());

        return mensagem.toString();
    }
}
