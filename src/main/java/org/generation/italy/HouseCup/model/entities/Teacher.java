package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;
import org.generation.italy.HouseCup.model.enums.TeacherStatus;

import java.time.LocalDate;

@Entity
@Access(AccessType.FIELD)
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private long id;
    private String name, surname;
    @Column(name= "hiring_date")
    private LocalDate hiringDate;
    private TeacherStatus status;
    @Column(name = "hourly_pay")
    private double hourlyPay;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Teacher() {}

    public Teacher(long id, String name, String surname, LocalDate hiringDate, TeacherStatus status, double hourlyPay, Course course) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.hiringDate = hiringDate;
        this.status = status;
        this.hourlyPay = hourlyPay;
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
    public LocalDate getHiringDate() {
        return hiringDate;
    }
    public TeacherStatus getStatus() {
        return status;
    }
    public double getHourlyPay() {
        return hourlyPay;
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
    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }
    public void setStatus(TeacherStatus status) {
        this.status = status;
    }
    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}
