package org.generation.italy.NewHouseCup.model.repositories;

import org.generation.italy.NewHouseCup.model.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepositoryJpa extends JpaRepository<Course, Long> {
}
