package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name="devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="device_id")
    private long id;
    private String name;
    @ManyToMany
    @JoinColumn(name="class_id") // non so se abbia senso col ManyToMany
    private List<Classroom> classroomList;

    public Device() {    }

    public Device(long id, String name, List<Classroom> classroomList) {
        this.id = id;
        this.name = name;
        this.classroomList = classroomList;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClassroom(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }
}