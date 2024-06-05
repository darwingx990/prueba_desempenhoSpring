package com.riwi.pruebaSpringBoot.infrastructure.abstract_service;

import com.riwi.pruebaSpringBoot.utils.enums.SortType;
import org.springframework.data.domain.Page;

public interface BaseService <RequestDto, ResponseDto, ID>{

    public ResponseDto getById(ID id);

    public Page<ResponseDto> getAll(int page, int size, SortType sort);

    public ResponseDto create(RequestDto requestDto);


    public ResponseDto update(ID id, RequestDto requestDto);

    public void delete(ID id);
}
