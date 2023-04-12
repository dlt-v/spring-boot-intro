package com.michalski.learnspring.businesscalcuation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;

interface DataService {
    int[] retrieveData();
}

@Component
@Primary
class MongoDbDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {12, 12, 12, 12};
    }
}

@Component
class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] {14, 14, 14, 14};
    }
}

@Configuration
@ComponentScan
public class BusinessCalculationService {
    DataService dataService;

    @Autowired
    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
