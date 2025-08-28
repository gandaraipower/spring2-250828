package com.back;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PersonService personService(){
        System.out.println("AppConfig.personService 호출됨!!");
        return new PersonService();
    }
}
