package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name="classrooms")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="class_id")
    private long id;
    private String name;
    private long capacity;
    private boolean isVirtual; // default false
    @Column(name="str_platform")
    private String strPlatform;
    @ManyToMany(mappedBy = "classroomList")
    private List<Device> deviceList;

    public Classroom(){   }
    public Classroom(long id, String name, long capacity, boolean isVirtual, String strPlatform) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.isVirtual = isVirtual;
        this.strPlatform = strPlatform;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getCapacity() {
        return capacity;
    }
    public boolean isVirtual() {
        return isVirtual;
    }
    public String getStrPlatform() {
        return strPlatform;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
    public void setVirtual(boolean virtual) {
        isVirtual = virtual;
    }
    public void setStrPlatform(String strPlatform) {
        this.strPlatform = strPlatform;
    }
}
