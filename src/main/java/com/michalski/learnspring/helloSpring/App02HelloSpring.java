package com.michalski.learnspring.helloSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloSpring {
    public static void main(String[] args) {
        // Launch a Spring Context

        try (var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class)) {
            // Configure the things that we want Spring to manage
            // @Configuration
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
//        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("myAddress"));
            System.out.println(context.getBean("person3"));
//        System.out.println(context.getBean(Address.class));

        }
    }
}
