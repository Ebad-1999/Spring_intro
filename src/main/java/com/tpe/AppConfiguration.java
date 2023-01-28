package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.awt.*;

@Configuration
@ComponentScan("com.tpe")
public class AppConfiguration {

    @Bean
    public Point point(){
        return  new Point(45,67);
    }

}

