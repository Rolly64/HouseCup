package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Access(AccessType.FIELD)
@Table(name="subscriptions")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_id")
    private long id;
    @Column(name = "has_paid")
    private boolean hasPaid; // default false
    @Column(name = "sub_date")
    private Date subDate;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
    @OneToOne
    @JoinColumn(name="course_id")
    private Course course;
    @Column(name = "teacher_review")
    private String teacherReview;
    @Column(name = "reviewGrade")
    private long reviewGrade;

    public Subscription(){  }
    public Subscription(long id, boolean hasPaid, Date subDate, Student student, Course course, String teacherReview, long reviewGrade) {
        this.id = id;
        this.hasPaid = hasPaid;
        this.subDate = subDate;
        this.student = student;
        this.course = course;
        this.teacherReview = teacherReview;
        this.reviewGrade = reviewGrade;
    }

    public long getId() {
        return id;
    }
    public boolean isHasPaid() {
        return hasPaid;
    }
    public Date getSubDate() {
        return subDate;
    }
    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }
    public String getTeacherReview() {
        return teacherReview;
    }
    public long getReviewGrade() {
        return reviewGrade;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }
    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void setTeacherReview(String teacherReview) {
        this.teacherReview = teacherReview;
    }
    public void setReviewGrade(long reviewGrade) {
        this.reviewGrade = reviewGrade;
    }
}
