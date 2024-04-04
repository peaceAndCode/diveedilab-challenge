package com.diveedilab.petchallenge.dto;

import java.util.UUID;

public class PetDTO {
    private UUID id;
    private String name;
    private String breed;

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
