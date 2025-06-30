package com.ashwani_coding.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfiguration configuration;

    @RequestMapping("/currency")
    public CurrencyServiceConfiguration getCurrencyConfiguration(){
        return configuration;
    }

}
