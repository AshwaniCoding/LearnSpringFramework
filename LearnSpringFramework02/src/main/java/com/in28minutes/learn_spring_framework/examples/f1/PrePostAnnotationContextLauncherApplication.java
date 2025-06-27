package com.in28minutes.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{

}

@Component
class SomeDependency{

    private SomeClass someClass;

    public SomeDependency(SomeClass someClass) {
        super();
        this.someClass = someClass;
        System.out.println("dependency injected");
    }

    @PostConstruct
    public void setUp(){
        System.out.println("Db setup done");
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Db setup close");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {


    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }


    }
}
