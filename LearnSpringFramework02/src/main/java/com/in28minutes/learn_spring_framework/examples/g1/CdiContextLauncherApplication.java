package com.in28minutes.learn_spring_framework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class DataService{

}

//@Component
@Named
class BusinessService{

    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

//    @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }
}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {


    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)){

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataService());

        }


    }
}
