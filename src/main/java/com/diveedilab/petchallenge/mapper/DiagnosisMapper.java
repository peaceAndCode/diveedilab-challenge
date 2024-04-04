package com.diveedilab.petchallenge.mapper;


import com.diveedilab.petchallenge.dto.DiagnosisDTO;
import com.diveedilab.petchallenge.model.Diagnosis;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiagnosisMapper {
    DiagnosisMapper INSTANCE = Mappers.getMapper(DiagnosisMapper.class);
    Diagnosis diagnosisDTOToDiagnosis(DiagnosisDTO diagnosisDTO);
    DiagnosisDTO diagnosisToDiagnosisDTO(Diagnosis diagnosis);
}
