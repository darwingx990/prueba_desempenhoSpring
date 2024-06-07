package com.riwi.pruebaSpringBoot.domain.repositories;

import com.riwi.pruebaSpringBoot.api.dto.responses.ClassResponse;
import com.riwi.pruebaSpringBoot.domain.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity,Long> {

//    ClassResponse findByClassNameOrDescription(String name, String description);
}
