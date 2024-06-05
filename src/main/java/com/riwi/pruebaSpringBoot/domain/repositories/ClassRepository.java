package com.riwi.pruebaSpringBoot.domain.repositories;

import com.riwi.pruebaSpringBoot.domain.entities.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity,Long> {
}
