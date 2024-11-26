package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private long id;
    private String name, surname;
    @ManyToOne
    @JoinColumn(name="course_id")
    private Course course;

    public Student(){}
    public Student(long id, String name, String surname, Course course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Course getCourse() {
        return course;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}