package com.riwi.pruebaSpringBoot.infrastructure.abstract_service;

import org.springframework.data.domain.Page;

public interface BaseService <RequestDto, ResponseDto, ID>{

    ResponseDto getById(ID id);

    Page<ResponseDto> getAll(int page, int size);

    ResponseDto create(RequestDto requestDto);


    ResponseDto update(ID id, RequestDto requestDto);

    void delete(ID id);
}
