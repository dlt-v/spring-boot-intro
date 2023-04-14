package com.michalski.learnspringjpaandhibernate.course.springdatajpa;

import com.michalski.learnspringjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringJpaRepository extends JpaRepository<Course, Long> {

}
