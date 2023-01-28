package com.tpe.service;


import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements MessageService{

    @Autowired
    @Qualifier("fileRepository")
    private Repository repository;
    @Override
    public void sendMessage(Message message) {
        System.out.println("I am a SMS Service, and I am sending you this message:"+message.getMessage());
        repository.sevMessage(message);
    }
}
