package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){}
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
    @Primary
    public Person person(){
        return new Person("Akash", 24, new Address("Bangalore", "Karnataka"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    //Autowiring with same name parameters
    @Bean
    public Person person3Parameters(String name, int age, Address address3){
        return new Person(name, age, address3);
    }

    @Bean
    public Person person4Qualifier(String name, int age, @Qualifier("person4") Address address3){
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Satna", "MP");
    }

    @Bean(name = "address3")
    @Qualifier("person4")
    public Address address3(){
        return new Address("Jabalpur", "MP");
    }

}
