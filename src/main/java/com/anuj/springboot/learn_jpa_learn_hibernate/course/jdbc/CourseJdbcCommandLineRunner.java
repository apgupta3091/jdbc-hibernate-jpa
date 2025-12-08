package com.anuj.springboot.learn_jpa_learn_hibernate.course.jdbc;

import com.anuj.springboot.learn_jpa_learn_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "learn AWS Now", "in28minutes"));
        repository.insert(new Course(2, "learn DEV ops Now", "in28minutes"));
        repository.insert(new Course(3, "learn java Now", "in28minutes"));
        repository.deleteById(3);
        System.out.println(repository.getById(1));
        System.out.println(repository.getById(2));

    }
}
