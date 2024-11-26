package org.generation.italy.HouseCup.model.entities;

import jakarta.persistence.*;

@Entity
@Access(AccessType.FIELD)
@Table(name="knowledges")
public class Knowledge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="knowledge_id")
    private long id;
    private String name, description;
    @Column(name="kl_level")
    private long klLevel;
    @ManyToOne // almeno che non facciamo un'enumerazione
    @JoinColumn(name="teacher_id")
    private Teacher teacher;

    public Knowledge(){}
    public Knowledge(long id, String name, String description, long klLevel, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.klLevel = klLevel;
        this.teacher = teacher;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public long getKlLevel() {
        return klLevel;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setKlLevel(long klLevel) {
        this.klLevel = klLevel;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
