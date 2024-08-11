package com.example.Autisto.repository;




import com.example.Autisto.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByEducatorId(Long educatorId);
}
