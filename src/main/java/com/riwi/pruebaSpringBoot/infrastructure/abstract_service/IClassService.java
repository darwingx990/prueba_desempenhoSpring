package com.riwi.pruebaSpringBoot.infrastructure.abstract_service;

import com.riwi.pruebaSpringBoot.api.dto.requests.ClassRequest;
import com.riwi.pruebaSpringBoot.api.dto.responses.ClassResponse;

public interface IClassService extends BaseService <ClassRequest, ClassResponse, Long>{
    public String FIELD_BY_SORT = "name";
}
