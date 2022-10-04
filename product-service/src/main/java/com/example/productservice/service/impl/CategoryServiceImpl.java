package com.example.productservice.service.impl;

/*
    @author uurdev
    @date 2.10.2022
*/


import com.example.productservice.domain.Category;
import com.example.productservice.repository.CategoryRepository;
import com.example.productservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getById(String id) {
        return categoryRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
