package com.diveedilab.petchallenge.dto;

import com.diveedilab.petchallenge.enums.Treatment;

import java.util.Date;
import java.util.UUID;

public class DiagnosisDTO {
    private UUID id;
    private String name;
    private Date date;
    private Treatment treatment;


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

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
