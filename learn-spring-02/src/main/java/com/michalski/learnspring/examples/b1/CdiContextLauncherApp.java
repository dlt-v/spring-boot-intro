package com.michalski.learnspring.examples.b1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Component
@Named
class BusinessService {
    private DataService dataService;

    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter injection performed.");
        this.dataService = dataService;
    }
}

@Named
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApp {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
