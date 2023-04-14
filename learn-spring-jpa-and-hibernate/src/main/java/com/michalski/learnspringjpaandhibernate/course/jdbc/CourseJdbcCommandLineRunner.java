package com.michalski.learnspringjpaandhibernate.course.jdbc;

import com.michalski.learnspringjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn Java", "Tomek :)"));
        courseJdbcRepository.insert(new Course(2, "Learn Python", "Andrew :("));
        courseJdbcRepository.delete(1);
    }
}
