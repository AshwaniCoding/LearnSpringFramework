package com.in28minutes.learn_spring_framework.examples.c1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

//@Component
@Service
public class BusinessCalculationService {

    private DataService dataService;

    public BusinessCalculationService(@Qualifier("mongoDBDatabase") DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMin() {
        return Arrays.stream(dataService.data())
                .min().orElse(0);
    }

    public int findMax() {
        return Arrays.stream(dataService.data())
                .max().orElse(0);
    }
}
