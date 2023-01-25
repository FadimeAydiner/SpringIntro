package com.sp.app;

import com.sp.AppConfiguration;
import com.sp.domain.Message;
import com.sp.service.MailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {
    public static void main(String[] args) {
        Message message=new Message();
        message.setMessage("Hello World");

        //indicating configuration class
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfiguration.class);
        MailService service=context.getBean(MailService.class);
        service.sendMessage(message);

    }
}
