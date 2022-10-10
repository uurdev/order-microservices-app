package com.example.productservice.serviceview;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.dto.CategoryReadDTO;
import com.example.productservice.dto.CategoryWriteDTO;

import javax.validation.Valid;

@Valid
public interface CategoryServiceView {
    CategoryReadDTO create(@Valid CategoryWriteDTO writeDTO);
    CategoryReadDTO getById(String id);
}
