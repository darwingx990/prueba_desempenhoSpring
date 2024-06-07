package com.riwi.pruebaSpringBoot.api.controller;

import com.riwi.pruebaSpringBoot.api.dto.requests.StudentRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.StudentResponse;
import com.riwi.pruebaSpringBoot.infrastructure.services.StudentService;
import com.riwi.pruebaSpringBoot.utils.enums.SortType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<StudentResponse> getById(@Validated @PathVariable Long id) {
            return  ResponseEntity.ok(this.studentService.getById(id));
    }

    @GetMapping
    public ResponseEntity<Page<StudentResponse>> getAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(required = false) SortType sortType) {
        if (Objects.isNull(sortType)) sortType = SortType.NONE;

        return ResponseEntity.ok(this.studentService.getAll(page -1, size, sortType));
    }

    @PostMapping
    public ResponseEntity<StudentResponse> create(@Validated @RequestBody StudentRequest studentRequest) {
        return  ResponseEntity.ok(this.studentService.create(studentRequest));
    }

}
