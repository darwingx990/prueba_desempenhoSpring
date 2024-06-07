package com.riwi.pruebaSpringBoot.api.controller;

import com.riwi.pruebaSpringBoot.api.dto.requests.StudentRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.StudentResponse;
import com.riwi.pruebaSpringBoot.infrastructure.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<StudentResponse> getById(@Validated @PathVariable Long id) {
            return  ResponseEntity.ok(this.studentService.getById(id));
    }

    @PostMapping
    public ResponseEntity<StudentResponse> create(@Validated @RequestBody StudentRequest studentRequest) {
        return  ResponseEntity.ok(this.studentService.create(studentRequest));
    }

}
