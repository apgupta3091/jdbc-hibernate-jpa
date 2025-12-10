package com.anuj.springboot.learn_jpa_learn_hibernate.course;

import com.anuj.springboot.learn_jpa_learn_hibernate.course.jdbc.CourseJdbcRepository;
import com.anuj.springboot.learn_jpa_learn_hibernate.course.jpa.CourseJpaRepository;
import com.anuj.springboot.learn_jpa_learn_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;


    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "learn AWS Now", "in28minutes"));
        repository.save(new Course(2, "learn DEV ops Now", "in28minutes"));
        repository.save(new Course(3, "learn jpa Now", "in28minutes"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findAll());
        System.out.println(repository.findByAuthor("in28minutes"));
        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("learn jpa Now"));
        System.out.println(repository.findByName("learn DEV ops Now"));
    }
}
