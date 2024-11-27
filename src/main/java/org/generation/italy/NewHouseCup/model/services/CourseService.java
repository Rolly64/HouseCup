package org.generation.italy.NewHouseCup.model.services;

import org.generation.italy.NewHouseCup.model.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> findCourseById(long id);
}
