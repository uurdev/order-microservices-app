package com.example.productservice.repository;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
