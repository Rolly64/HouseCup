package org.generation.italy.NewHouseCup.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_id")
    private long id;
    private String name;
    private String surname;
    private LocalDate dob;
    private char sex;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "start_date")
    private LocalDate startDate;
    private String nickname;
    @Column(name = "school_boss")
    private boolean schoolBoss;
    @OneToMany(mappedBy = "teacher")
    private List<Score> teacherAssignedScores = new ArrayList<>();
    @ManyToMany
    @JoinTable(
            name = "teaching_assignments",
            joinColumns = @JoinColumn(name = "teacher_id"),
            inverseJoinColumns = @JoinColumn(name = "class_id")

    )
    private List<Course> coursesList = new ArrayList<>();

    public Teacher() {}

    public Teacher(long id, String name, String surname, LocalDate dob, char sex, String email, String phoneNumber, LocalDate startDate, String nickname, boolean schoolBoss, List<Course> coursesList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.sex = sex;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.nickname = nickname;
        this.schoolBoss = schoolBoss;
        this.coursesList = coursesList;
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
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public boolean isSchoolBoss() {
        return schoolBoss;
    }
    public void setSchoolBoss(boolean schoolBoss) {
        this.schoolBoss = schoolBoss;
    }
    public List<Course> getCoursesList() {
        return coursesList;
    }
    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }
}
