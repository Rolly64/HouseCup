package org.generation.italy.NewHouseCup.controllers;

import org.generation.italy.NewHouseCup.model.entities.Student;
import org.generation.italy.NewHouseCup.model.services.StudentService;
import org.generation.italy.NewHouseCup.model.services.StudentServiceJpa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String studentList(Model model) {
        List<Student> students = this.studentService.getAllStudents();
        model.addAttribute("STUDENT", students);
        return "students/list";
    }

    @GetMapping("/create")
    public String createStudent(Model model) {
        model.addAttribute("STUDENT", new Student());
        return "students/create";
    }

}
