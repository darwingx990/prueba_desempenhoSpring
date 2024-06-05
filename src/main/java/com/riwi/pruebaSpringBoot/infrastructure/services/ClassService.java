package com.riwi.pruebaSpringBoot.infrastructure.services;

import com.riwi.pruebaSpringBoot.api.dto.requests.ClassRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.ClassResponse;
import com.riwi.pruebaSpringBoot.domain.entities.ClassEntity;
import com.riwi.pruebaSpringBoot.domain.repositories.ClassRepository;
import com.riwi.pruebaSpringBoot.infrastructure.abstract_service.IClassService;
import com.riwi.pruebaSpringBoot.infrastructure.mappers.ClassMappers;
import com.riwi.pruebaSpringBoot.utils.enums.SortType;
import com.riwi.pruebaSpringBoot.utils.exceptions.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClassService implements IClassService {

    @Autowired
    private ClassRepository classRepository;
    private ClassMappers classMappers = new ClassMappers();

    @Override
    public ClassResponse getById(Long id) {
        return classMappers.classEntityToResponse(classMappers.find(classRepository, id));
    }

    @Override
    public Page<ClassResponse> getAll(int page, int size, SortType sortType) {
        if (page < 0) page = 0;
        PageRequest pagination = null;

        switch (sortType) {
            case NONE -> pagination = PageRequest.of(page, size);
            case ASC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).ascending());
            case DESC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).descending());
        }
        return this.classRepository.findAll(pagination).map(this::classEntityToResponse);
    }

    @Override
    public ClassResponse create(ClassRequest classRequest) {
        return classMappers.classEntityToResponse(this.classRepository.save(classMappers.classReqtoEntity(classRequest)));
    }

    @Override
    public ClassResponse update(Long id, ClassRequest classRequest) {
       if (classMappers.find(classRepository, id) != null){
        ClassEntity classUpdate = classMappers.classReqtoEntity(classRequest);
        classRepository.save(classUpdate);
        return this.classMappers.classEntityToResponse(classRepository.save(classUpdate));}
       else {ClassEntity classEntity= classMappers.classReqtoEntity(classRequest);
       return this.classMappers.classEntityToResponse(classRepository.save(classEntity));}
    }

    @Override
    public void delete(Long aLong) {

    }

    public ClassResponse classEntityToResponse(ClassEntity classEntity){

        return ClassResponse.builder()
                .id(classEntity.getId())
                .name(classEntity.getName())
                .description(classEntity.getDescription())
                .createdAt(classEntity.getCreatedAt())
                .active(classEntity.getActive())
                .build();

    }
}
