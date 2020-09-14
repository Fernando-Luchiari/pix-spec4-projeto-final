package br.com.mastertech.notification.controllers;

import br.com.mastertech.notification.clients.CustomerClients.Customer;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notify")
public class EmailController {

    @Value("${twillio.account.sid}")
    private String sid;

    @Value("${twillio.auth.token}")
    private String authToken;


    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/email")
    public String sendMail(Customer customer) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setText("Hello from Spring Boot Application");
        message.setTo("yugo7@protonmail.com");
        message.setFrom("yugo@gmail.com");

        try {
            mailSender.send(message);
            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email.";
        }
    }

    @GetMapping("/sms")
    public String sendSMS() {
        Twilio.init(sid, authToken);

        Message message = Message
                .creator(new PhoneNumber("+5511983567627"), // to
                        new PhoneNumber("+17542039152"), // from
                        "Where's Wallace?")
                .create();

        return message.getSid();
    }
}