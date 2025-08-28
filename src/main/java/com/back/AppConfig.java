package com.back;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public PersonRepository personRepository() {
        return new PersonRepository(1);
    }

    @Bean
    public PersonRepository personRepositoryV2() {
        return new PersonRepository(2);
    }

    @Bean
    public ApplicationRunner myApplicationRunner3(){
        return (args -> {
            System.out.println("MyApplicationRunner3.run");
            work1();
            work2();
        });
    }

    public void work1(){
        System.out.println("work1");
    }

    public void work2(){
        System.out.println("work2");
    }

//    @Bean
//    public MyApplicationRunner myApplicationRunner1(){
//        System.out.println("AppConfig.myApplicationRunner1");
//        return new MyApplicationRunner(1);
//    }
//
//    @Bean
//    public MyApplicationRunner myApplicationRunner2(){
//        System.out.println("AppConfig.myApplicationRunner2");
//        return new MyApplicationRunner(2);
//    }


}