package org.generation.italy.NewHouseCup.model.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Access(AccessType.FIELD)
@Table(name = "scores")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scores_id")
    private long id;
    private LocalDate date;
    private long points;
    private String reason, status;
    @Column(name = "change_reason")
    private String changeReason;
    @Column(name = "points_change")
    private long pointsChange;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    public Score() {}

    public Score(long id, LocalDate date, long points, String reason, String status, String changeReason, long pointsChange, Student student, Teacher teacher) {
        this.id = id;
        this.date = date;
        this.points = points;
        this.reason = reason;
        this.status = status;
        this.changeReason = changeReason;
        this.pointsChange = pointsChange;
        this.student = student;
        this.teacher = teacher;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public long getPoints() {
        return points;
    }
    public void setPoints(long points) {
        this.points = points;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getChangeReason() {
        return changeReason;
    }
    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }
    public long getPointsChange() {
        return pointsChange;
    }
    public void setPointsChange(long pointsChange) {
        this.pointsChange = pointsChange;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
