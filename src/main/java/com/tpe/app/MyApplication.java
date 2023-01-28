package com.tpe.app;


import com.tpe.AppConfiguration;
import com.tpe.domain.Message;
import com.tpe.service.MessageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApplication {

    public static void main(String[] args) {


        Message message = new Message();
        message.setMessage("You orders has been sent to cargo ...");

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);


       // MailService service= context.getBean(MailService.class);
       // MessageService service= context.getBean(MessageService.class);//without parameter is called single bean


       MessageService service= context.getBean("smsService", MessageService.class);


        service.sendMessage(message);

        /* this is optaionl
          MessageService service2 = context.getBean("mailService", MessageService.class);

        if(service2 == service){
            System.out.println("They are the same Object");
        }else {
            System.out.println("They are different object");
        }
         */



        context.close();

    }
}
