package com.tpe.service;


import com.tpe.domain.Message;
import com.tpe.repository.Repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("mailService")
public class MailService  implements MessageService{


    /*
   Repository repository= new FileRepository();

     -----Field Injection  ------
    @Autowired
    @Qualifier("dbRepository")
    Repository repository;

     setter Injection
    private Repository repository;

    @Autowired
    @Qualifier("dbRepository")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }

     */
    // Constructor injection
    private Repository repository;
    //@Autowired // if you have one constructor no need to used autowired annotation spring know.
    public MailService(@Qualifier("dbRepository") Repository repository) {
        this.repository = repository;
    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("I am a Mail Service, and I am sending you this message:"+message.getMessage());
        repository.sevMessage(message);
    }
}
