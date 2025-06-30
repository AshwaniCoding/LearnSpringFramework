package com.ashwani.coding.learn_jpa_and_hibernate.course;

import com.ashwani.coding.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.ashwani.coding.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.ashwani.coding.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS now!", "Akash"));
        repository.save(new Course(2, "Learn DevOps now!", "Kaushal"));
        repository.save(new Course(3, "Learn React now!", "Aniket"));
        repository.save(new Course(4, "Learn Hadoop now!", "Akash"));

        repository.deleteById(2L);

        System.out.println(repository.getReferenceById(1L));
        System.out.println(repository.getReferenceById(3L));

        System.out.println("-------------------Get All-------------------------");
        System.out.println(repository.findAll());

        System.out.println("-------------------Get by author-------------------------");
        System.out.println(repository.getByAuthor("Akash"));
        System.out.println("-------------------Get by name-------------------------");
        System.out.println(repository.getByName("Learn React now!"));

    }
}
