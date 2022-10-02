package com.example.productservice.service;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.domain.Product;

public interface ProductService {
    Product save(Product product);
    Product getById(String id);
}
