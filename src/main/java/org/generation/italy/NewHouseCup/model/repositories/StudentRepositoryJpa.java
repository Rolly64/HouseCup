package org.generation.italy.NewHouseCup.model.repositories;

import org.generation.italy.NewHouseCup.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoryJpa extends JpaRepository<Student, Long> {
}
