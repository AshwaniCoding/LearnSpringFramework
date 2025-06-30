package com.ashwani_coding.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

//courses
//Course: id, name, author

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "Akash"),
                new Course(2, "Learn DevOps", "Kaushal"),
                new Course(3, "Learn Java", "Aniket")
        );
    }

}
