package br.com.mastertech.notification.consumer;

import br.com.mastertech.notification.clients.CustomerClients.Customer;
import br.com.mastertech.notification.clients.CustomerClients.CustomerClient;
import br.com.mastertech.notification.services.MailService;
import br.com.mastertech.notification.services.SmsService;
import br.com.mastertech.transaction.entity.Document;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

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
        String mensagem = montaMensagemCurta(documentEvent);
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

    public String montaMensagemCurta(Document documentEvent){

        StringBuilder mensagem = new StringBuilder();

        mensagem.append("Informe PIX: \n");
        mensagem.append(documentEvent.getNomePagador());
        mensagem.append(" realizou um pagamento de R$");
        mensagem.append(documentEvent.getValor());
        mensagem.append(" por ");
        mensagem.append(documentEvent.getSolicitacaoPagador());

        return mensagem.toString();
    }
}
