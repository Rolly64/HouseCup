package org.generation.italy.NewHouseCup.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private long id;
    private String name, surname, background, email;
    private char sex;
    private LocalDate dob;
    private boolean prefect;
    @Column(name = "title_of_study")
    private String titleOfStudy;
    @Column(name = "phone_number")
    private String phoneNumber;
    @ManyToOne
    @JoinColumn(name="class_id")
    private Course course;
    @ManyToOne
    @JoinColumn(name="house_id")
    private House house;
    @OneToMany(mappedBy = "student")
    private List<Score> studentScores = new ArrayList<>();

    public Student() {}

    public Student(long id, String name, String surname, String background, String email, char sex, LocalDate dob, boolean prefect, String titleOfStudy, String phoneNumber, Course course, House house) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.background = background;
        this.email = email;
        this.dob = dob;
        this.prefect = prefect;
        this.titleOfStudy = titleOfStudy;
        this.phoneNumber = phoneNumber;
        this.course = course;
        this.house = house;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getBackground() {
        return background;
    }
    public void setBackground(String background) {
        this.background = background;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public boolean isPrefect() {
        return prefect;
    }
    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }
    public String getTitleOfStudy() {
        return titleOfStudy;
    }
    public void setTitleOfStudy(String titleOfStudy) {
        this.titleOfStudy = titleOfStudy;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public House getHouse() {
        return house;
    }
    public void setHouse(House house) {
        this.house = house;
    }
}
