package com.riwi.pruebaSpringBoot.domain.repositories;

import com.riwi.pruebaSpringBoot.domain.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
