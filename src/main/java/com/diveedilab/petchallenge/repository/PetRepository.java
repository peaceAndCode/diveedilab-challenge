package com.diveedilab.petchallenge.repository;

import com.diveedilab.petchallenge.model.Diagnosis;
import com.diveedilab.petchallenge.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PetRepository extends JpaRepository<Pet, UUID> {
}
