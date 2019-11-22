package com.iodia.eduodia.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class EMailSender
{
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail()
    {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("jiptesh@gmail.com", "jiptesh.java@gmail.com", "jiptesh.m@comakeit.com");

        msg.setSubject("Welcome to OdiCommunication");
        msg.setText("Hello World \n Odi Community");

        javaMailSender.send(msg);

    }

}
