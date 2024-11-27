package org.generation.italy.NewHouseCup.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name = "classes")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private long id;
    @Column(name = "class_name")
    private String name;
    @Column(name = "class_status")
    private String status;
    @ManyToMany(mappedBy = "classes")
    private List<Teacher> teacherList = new ArrayList<>();
    @OneToMany(mappedBy = "course")
    private List<Student> studentList = new ArrayList<>();

    public Course() {}

    public Course(long id, String name, String status, List<Teacher> teacherList) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.teacherList = teacherList;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
}
