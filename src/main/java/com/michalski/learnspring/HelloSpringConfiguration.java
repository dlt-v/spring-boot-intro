package com.michalski.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city, String zip) {};
@Configuration
public class HelloSpringConfiguration {
    @Bean
    public String name() {
        return "Thomas";
    }
    @Bean
    public Integer age() {
        return 23;
    }
    @Bean
    public Person person() {
        var person = new Person("Tomek", 24);
        return person;
    }
    @Bean(name = "myAddress")
    public Address address() {
        return new Address("Siennicka 4", "Mińsk Mazowiecki", "05-300");
    }
}
