package com.diveedilab.petchallenge.resource;


import com.diveedilab.petchallenge.dto.DiagnosisDTO;
import com.diveedilab.petchallenge.dto.PetDTO;
import com.diveedilab.petchallenge.service.PetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/pet")
public class PetResource {

    private final PetService petService;

    public PetResource(PetService petService1){
        petService = petService1;
    }

    @GetMapping("/pets")
    public List<PetDTO> getPets(){return petService.getPetsList();}

    @GetMapping("/{id}")
    public PetDTO getById(@PathVariable UUID id){
        return petService.getPetById(id);
    }

    @GetMapping("/{id}/diagnosis")
    public List<DiagnosisDTO> getDiagnosis(@PathVariable UUID id){
        return petService.getDiagnosisByPetId(id);
    }
}
