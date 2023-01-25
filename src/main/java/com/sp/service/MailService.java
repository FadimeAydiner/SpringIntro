package com.sp.service;

import com.sp.domain.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MailService {
    public void sendMessage(Message message){
        System.out.println("I am a mail service. I am sending you this message: "+message.getMessage());

    }
}
