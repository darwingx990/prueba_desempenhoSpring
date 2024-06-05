package com.riwi.pruebaSpringBoot.domain.repositories;

import com.riwi.pruebaSpringBoot.domain.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Long> {
}
