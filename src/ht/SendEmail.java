/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author PC
 */
public class SendEmail {

    public static void send_Email() throws MessagingException {

        String em = Tam.emailtam;
        String recepient = em;
        System.out.println(recepient);
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        String myAccount = "test002stngb@gmail.com";
        String password = "01642485129";

        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myAccount, password);
            }
        });

        Message message = prepareMessage(session, myAccount, recepient);
        Transport.send(message);
        System.out.println("Successfully sent");
    }

    private static Message prepareMessage(Session session, String myAccount, String recepient) {

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccount));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
            message.setSubject("QuizGame");
            message.setText("QuizGame: your new password is: " + Tam.randomPW);
            return message;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) throws MessagingException {
        send_Email();
    }
}
