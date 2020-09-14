package br.com.mastertech.notification.services;

import br.com.mastertech.notification.clients.CustomerClients.Customer;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SmsService {

    @Value("${twillio.account.sid}")
    private static String sid;

    @Value("${twillio.auth.token}")
    private static String authToken;

    @Value("${twillio.phone.number}")
    private static String senderNumber;


    public void sendSMS(Customer customer, String mensagem) {
        Twilio.init(sid, authToken);

        Message message = Message
                .creator(new PhoneNumber("+5511983567927"), // to
                        new PhoneNumber(senderNumber), // from
                        mensagem)
                .create();

//        Message message = Message
//                .creator(new PhoneNumber(customer.getPhoneNumber()), // to
//                        new PhoneNumber(senderNumber), // from
//                        mensagem)
//                .create();

        System.out.println(message.getSid());
    }

}
