package com.michalski.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};
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
        var person = new Person("Tomek", 24, new Address("Line1", "Line2", "line 3"));
        return person;
    }
    @Bean(name = "myAddress")
    public Address address() {
        return new Address("Siennicka 4", "Mińsk Mazowiecki", "05-300");
    }
    @Bean // by methods
    public Person person2() {
        return new Person(name(), age(), address());
    }
    @Bean // by parameters
    public Person person3(String name, int age, Address myAddress) {
        return new Person(name, age, myAddress);
    }
}
