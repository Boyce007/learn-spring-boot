package com.daniel.learnspringboot.courses.controller;

import com.daniel.learnspringboot.courses.models.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;


@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1L,"LeanMicroServices","in28Minutes"));
    }

    @GetMapping("/courses/1")
    public Course getCourse() {
        return new Course(2L,"LearnMicroServices 1","In28Minutes");
    }

}
