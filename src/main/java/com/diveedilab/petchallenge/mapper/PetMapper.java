package com.diveedilab.petchallenge.mapper;

import com.diveedilab.petchallenge.dto.PetDTO;
import com.diveedilab.petchallenge.model.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PetMapper {
    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);
    PetDTO petToPetDTO(Pet pet);
    Pet petDTOToPet(PetDTO petDTO);
}
