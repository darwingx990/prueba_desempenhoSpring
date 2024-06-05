package com.riwi.pruebaSpringBoot.infrastructure.abstract_service;

import com.riwi.pruebaSpringBoot.api.dto.requests.StudentRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.StudentResponse;
import com.riwi.pruebaSpringBoot.domain.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentService extends BaseService<StudentRequest, StudentResponse, Long> {
}
