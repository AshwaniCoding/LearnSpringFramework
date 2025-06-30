package com.ashwani.coding.learn_jpa_and_hibernate.course.springdatajpa;

import com.ashwani.coding.learn_jpa_and_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course> getByAuthor(String author);
    List<Course> getByName(String name);

}
