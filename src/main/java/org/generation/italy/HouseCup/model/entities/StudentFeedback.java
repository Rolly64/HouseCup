package org.generation.italy.HouseCup.model.entities;


import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="students_feedbacks")
public class StudentFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private long id;
    private long grade;
    private String review;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;


    public StudentFeedback() {}
    public StudentFeedback(long id, long grade, String review, Student student, Teacher teacher, Module module) {
        this.id = id;
        this.grade = grade;
        this.review = review;
        this.student = student;
        this.teacher = teacher;
        this.module = module;
    }

    public long getId() {
        return id;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public Student getStudent() {
        return student;
    }
    public String getReview() {
        return review;
    }
    public long getGrade() {
        return grade;
    }
    public Module getModule() {
        return module;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setGrade(long grade) {
        this.grade = grade;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void setModule(Module module) {
        this.module = module;
    }
}
