package com.riwi.pruebaSpringBoot.infrastructure.services;

import com.riwi.pruebaSpringBoot.api.dto.requests.StudentRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.StudentResponse;
import com.riwi.pruebaSpringBoot.domain.repositories.StudentRepository;
import com.riwi.pruebaSpringBoot.infrastructure.abstract_service.IStudentService;
import com.riwi.pruebaSpringBoot.utils.enums.SortType;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    private StudentRepository studentRepository;
    @Override
    public StudentResponse getById(Long aLong) {
        return null;
    }

    @Override
    public Page<StudentResponse> getAll(int page, int size, SortType sort) {
        return null;
    }

    @Override
    public StudentResponse create(StudentRequest studentRequest) {
        return null;
    }

    @Override
    public StudentResponse update(Long aLong, StudentRequest studentRequest) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
