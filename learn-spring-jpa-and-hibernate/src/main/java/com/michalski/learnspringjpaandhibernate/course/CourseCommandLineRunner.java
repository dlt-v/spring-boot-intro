package com.michalski.learnspringjpaandhibernate.course;

import com.michalski.learnspringjpaandhibernate.course.springdatajpa.CourseSpringJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn Java", "Tomek :)"));
        repository.save(new Course(2, "Learn Python", "Andrew :("));

        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
    }
}
