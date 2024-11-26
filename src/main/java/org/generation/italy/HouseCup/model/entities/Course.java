package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private long id;
    @Column(name="student_qty")
    private long studentQty;
    @Column(name="total_hours")
    private long totalHours;
    private String title, character, description, type, program;
    private double price;
    @Column(name="starting_date")
    private Date startingDate;
    @Column(name="ending_date")
    private Date endingDate;
    @OneToMany(mappedBy = "course")
    private List<Student> studentList;

    public Course(){}
    public Course(long id, long studentQty, long totalHours, String title, String character, String description, String type, String program, double price, Date startingDate, Date endingDate) {
        this.id = id;
        this.studentQty = studentQty;
        this.totalHours = totalHours;
        this.title = title;
        this.character = character;
        this.description = description;
        this.type = type;
        this.program = program;
        this.price = price;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public long getId() {
        return id;
    }
    public long getStudentQty() {
        return studentQty;
    }
    public long getTotalHours() {
        return totalHours;
    }
    public String getTitle() {
        return title;
    }
    public String getCharacter() {
        return character;
    }
    public String getDescription() {
        return description;
    }
    public String getType() {
        return type;
    }
    public String getProgram() {
        return program;
    }
    public double getPrice() {
        return price;
    }
    public Date getStartingDate() {
        return startingDate;
    }
    public Date getEndingDate() {
        return endingDate;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setStudentQty(long studentQty) {
        this.studentQty = studentQty;
    }
    public void setTotalHours(long totalHours) {
        this.totalHours = totalHours;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCharacter(String character) {
        this.character = character;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

}
/*
    course_id bigserial NOT NULL,
    title character varying(64) NOT NULL,
    description character varying(500),
    price real,
    type character varying(32),
    student_qty bigint,
    starting_date date NOT NULL,
    ending_date date NOT NULL,
    total_hours bigint NOT NULL,
    program character varying(500),
    PRIMARY KEY (course_id)
 */
