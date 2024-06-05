package com.riwi.pruebaSpringBoot.api.controller;

import com.riwi.pruebaSpringBoot.api.dto.requests.ClassRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.ClassResponse;
import com.riwi.pruebaSpringBoot.infrastructure.services.ClassService;
import com.riwi.pruebaSpringBoot.utils.enums.SortType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(path = "/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping
    public ResponseEntity<Page<ClassResponse>> getClasses(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(required = false) SortType sortType) {
        if (Objects.isNull(sortType)) sortType = SortType.NONE;
        return ResponseEntity.ok(this.classService.getAll(page - 1, size, sortType));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClassResponse> getById(@Validated @PathVariable Long id) {
        return ResponseEntity.ok(this.classService.getById(id));
    }

    @PostMapping
    public ResponseEntity<ClassResponse> createClass(@Validated @RequestBody ClassRequest classRequest) {
        return ResponseEntity.ok(this.classService.create(classRequest));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClassResponse> updateClass(@PathVariable Long id, @Validated @RequestBody ClassRequest classRequest) {
        return ResponseEntity.ok(this.classService.update(id, classRequest));
    }


}
