package com.diveedilab.petchallenge.model;

import com.diveedilab.petchallenge.enums.Treatment;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private Date date;
    @Enumerated(EnumType.STRING)
    private Treatment treatment;
    @ManyToOne
    private Pet pet;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
