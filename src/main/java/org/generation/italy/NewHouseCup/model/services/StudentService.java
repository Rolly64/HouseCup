package org.generation.italy.NewHouseCup.model.services;

import org.generation.italy.NewHouseCup.model.entities.Score;
import org.generation.italy.NewHouseCup.model.entities.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> findStudentById(long id);
}
