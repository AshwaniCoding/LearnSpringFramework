package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){}
record Address(String city, String state){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ashwani";
    }

    @Bean
    public int age(){
        return 23;
    }

    @Bean
    public Person person(){
        return new Person("Akash", 24);
    }

    @Bean
    public Address address(){
        return new Address("Satna", "MP");
    }

}
