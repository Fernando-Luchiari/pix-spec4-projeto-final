package br.com.mastertech.notification.services;

import br.com.mastertech.notification.clients.CustomerClients.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public String sendMail(String mensagem, Customer customer) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setText(mensagem);
        message.setTo(customer.getEmail());
        message.setFrom("PIX grupo 3");

        try {
            mailSender.send(message);
            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email.";
        }
    }
}
