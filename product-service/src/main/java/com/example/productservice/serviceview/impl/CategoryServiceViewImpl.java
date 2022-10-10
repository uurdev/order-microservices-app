package com.example.productservice.serviceview.impl;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.domain.Category;
import com.example.productservice.dto.CategoryReadDTO;
import com.example.productservice.dto.CategoryWriteDTO;
import com.example.productservice.service.CategoryService;
import com.example.productservice.serviceview.CategoryServiceView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@Service
public class CategoryServiceViewImpl implements CategoryServiceView {

    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    @Override
    public CategoryReadDTO create(@Valid CategoryWriteDTO writeDTO) {
        return modelMapper.map(categoryService
                .save(modelMapper.map(writeDTO, Category.class)), CategoryReadDTO.class);
    }

    @Override
    public CategoryReadDTO getById(String id) {
        return modelMapper.map(categoryService.getById(id), CategoryReadDTO.class);
    }
}
