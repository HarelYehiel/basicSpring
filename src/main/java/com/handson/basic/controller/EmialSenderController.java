package com.handson.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Service
@RestController
@RequestMapping("/api/students")
public class EmialSenderController {

    @Autowired
    private JavaMailSender mailSender;
    @Value("${Spring.mail.username}")
    private String USER_NAME;
    @RequestMapping(value = "/sendAllMails", method = RequestMethod.GET)
    public ResponseEntity<?>  sendMail(String toMail, String subject, String body){
        SimpleMailMessage message= new SimpleMailMessage();
        message.setFrom(USER_NAME);
        message.setSubject(subject);
        message.setText(body);
        message.setTo(toMail);

        mailSender.send(message);

        return new ResponseEntity<>("SENDING", HttpStatus.OK);
    }

}
