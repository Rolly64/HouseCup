package org.generation.italy.NewHouseCup.model.services;

import org.generation.italy.NewHouseCup.model.entities.Student;
import org.generation.italy.NewHouseCup.model.repositories.StudentRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceJpa implements StudentService{
    private StudentRepositoryJpa studentRepo;

    @Autowired
    public StudentServiceJpa(StudentRepositoryJpa studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> findStudentById(long id) {
        return studentRepo.findById(id);
    }
}
