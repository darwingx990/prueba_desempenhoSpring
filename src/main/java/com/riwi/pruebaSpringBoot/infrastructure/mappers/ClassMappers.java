package com.riwi.pruebaSpringBoot.infrastructure.mappers;

import com.riwi.pruebaSpringBoot.api.dto.requests.ClassRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.ClassResponse;
import com.riwi.pruebaSpringBoot.domain.entities.ClassEntity;
import com.riwi.pruebaSpringBoot.domain.repositories.ClassRepository;
import com.riwi.pruebaSpringBoot.utils.exceptions.BadRequestException;


public class ClassMappers {

    public ClassResponse classEntityToResponse(ClassEntity classEntity){

        return ClassResponse.builder()
                .id(classEntity.getId())
                .name(classEntity.getName())
                .description(classEntity.getDescription())
                .createdAt(classEntity.getCreatedAt())
                .active(classEntity.getActive())
                .build();

    }

    public ClassEntity find(ClassRepository classRepository, Long id){
        return classRepository.findById(id)
                .orElseThrow(()-> new BadRequestException("Id not found"));
    }

    public ClassEntity classReqtoEntity(ClassRequest classRequest) {
        return ClassEntity.builder()
                .name(classRequest.getName())
                .description(classRequest.getDescription())
                .active(classRequest.getActive())
                .build();
    }
}
