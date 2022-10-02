package com.example.productservice.repository;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {
}
