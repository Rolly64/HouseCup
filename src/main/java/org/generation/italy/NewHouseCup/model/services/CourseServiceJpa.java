package org.generation.italy.NewHouseCup.model.services;

import org.generation.italy.NewHouseCup.model.entities.Course;
import org.generation.italy.NewHouseCup.model.repositories.CourseRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceJpa implements CourseService{
    private CourseRepositoryJpa courseRepo;

    @Autowired
    public CourseServiceJpa(CourseRepositoryJpa courseRepo) {
        this.courseRepo = courseRepo;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public Optional<Course> findCourseById(long id) {
        return courseRepo.findById(id);
    }
}
