package com.michalski.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigController {

    @Autowired
    private CurrencyServiceConfig currencyServiceConfig;

    @RequestMapping("/currency-config")
    public CurrencyServiceConfig retrieveAllCourses() {
        return currencyServiceConfig;
    }
}
