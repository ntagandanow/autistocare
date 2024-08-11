package com.example.Autisto.services;

import com.example.Autisto.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);
    List<Course> findAllCourses();
    Course findById(Long id);
}

