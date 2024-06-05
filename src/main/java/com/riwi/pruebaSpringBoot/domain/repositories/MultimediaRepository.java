package com.riwi.pruebaSpringBoot.domain.repositories;

import com.riwi.pruebaSpringBoot.domain.entities.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultimediaRepository extends JpaRepository<Multimedia, Long> {
}
