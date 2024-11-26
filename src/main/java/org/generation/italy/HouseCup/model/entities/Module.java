package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="modules")
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "module_id")
    private long id;
    private String type, description;
    @Column(name = "duration_in_hours")
    private long durationInHours;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Module() {}

    public Module(long id, String type, String description, long durationInHours, Course course) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.durationInHours = durationInHours;
        this.course = course;
    }

    public long getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }
    public long getDurationInHours() {
        return durationInHours;
    }
    public Course getCourse() {
        return course;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setDurationInHours(long durationInHours) {
        this.durationInHours = durationInHours;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
}
