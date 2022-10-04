package com.example.productservice.service;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.domain.Category;

public interface CategoryService {
    Category save(Category category);
    Category getById(String id);
}
