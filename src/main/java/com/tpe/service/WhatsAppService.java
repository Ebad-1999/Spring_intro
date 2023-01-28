package com.tpe.service;

import com.tpe.domain.Message;
import org.springframework.stereotype.Component;

@Component("whatsAppService")
public class WhatsAppService implements MessageService{
    @Override
    public void sendMessage(Message message) {
        System.out.println("I am a Whatsapp  Service, and I am sending you this message:"+message.getMessage());
    }
}
