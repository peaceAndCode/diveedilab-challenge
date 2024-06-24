package com.diveedilab.petchallenge.service;


import com.diveedilab.petchallenge.dto.DiagnosisDTO;
import com.diveedilab.petchallenge.dto.PetDTO;
import com.diveedilab.petchallenge.mapper.DiagnosisMapper;
import com.diveedilab.petchallenge.mapper.PetMapper;
import com.diveedilab.petchallenge.model.Pet;
import com.diveedilab.petchallenge.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PetService {

    private final PetRepository petRepository;
    public PetService(PetRepository petRepository1){
        petRepository = petRepository1;
    }

    public List<PetDTO> getPetsList(){
        return petRepository
                .findAll()
                .stream()
                .map(PetMapper.INSTANCE::petToPetDTO)
                .toList();
    }

    public PetDTO getPetById(UUID id){
        Pet pet = petRepository.findById(id).orElseThrow();
        return PetMapper.INSTANCE.petToPetDTO(pet);
    }

    public List<DiagnosisDTO> getDiagnosisByPetId(UUID id) {
        Pet pet = petRepository.findById(id).orElseThrow();
        return pet
                .getDiagnosis()
                .stream()
                .map(DiagnosisMapper.INSTANCE::diagnosisToDiagnosisDTO)
                .toList();
    }
}
