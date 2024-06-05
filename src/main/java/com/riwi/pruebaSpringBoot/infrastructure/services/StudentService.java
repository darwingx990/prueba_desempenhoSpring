package com.riwi.pruebaSpringBoot.infrastructure.services;

import com.riwi.pruebaSpringBoot.api.dto.requests.ClassRequest;
import com.riwi.pruebaSpringBoot.api.dto.requests.StudentRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.StudentResponse;
import com.riwi.pruebaSpringBoot.domain.entities.ClassEntity;
import com.riwi.pruebaSpringBoot.domain.entities.Student;
import com.riwi.pruebaSpringBoot.domain.repositories.StudentRepository;
import com.riwi.pruebaSpringBoot.infrastructure.abstract_service.IStudentService;
import com.riwi.pruebaSpringBoot.utils.enums.SortType;
import com.riwi.pruebaSpringBoot.utils.exceptions.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentResponse getById(Long id) {
        return this.EntityToResponse(this.find(id));
    }


    @Override
    public Page<StudentResponse> getAll(int page, int size, SortType sort) {
        return null;
    }

    @Override
    public StudentResponse create(StudentRequest studentRequest) {
        StudentResponse studentResponse = this.EntityToResponse(this.studentRepository.save(this.studentReqtoEntity(studentRequest));
        return studentResponse;
    }

    @Override
    public StudentResponse update(Long aLong, StudentRequest studentRequest) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    private StudentResponse EntityToResponse(Student student) {
        return StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .createdAt(student.getCreatedAt())
                .active(student.getActive())
                .build();

    }

    private Student find(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new BadRequestException("Id not found."));
    }

    public Student studentReqtoEntity(StudentRequest request) {
        return Student.builder()
                .name(request.getName())
                .email(request.getEmail())
                .active(request.getActive())
                .build();
    }
}
