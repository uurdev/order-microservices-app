package com.example.productservice.serviceview;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.dto.ProductReadDTO;
import com.example.productservice.dto.ProductWriteDTO;

public interface ProductServiceView {
    ProductReadDTO create(ProductWriteDTO writeDTO);
    ProductReadDTO getById(String id);
}
