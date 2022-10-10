package com.example.productservice.serviceview.impl;

/*
    @author uurdev
    @date 2.10.2022
*/

import com.example.productservice.domain.Category;
import com.example.productservice.domain.Product;
import com.example.productservice.dto.ProductReadDTO;
import com.example.productservice.dto.ProductWriteDTO;
import com.example.productservice.service.ProductService;
import com.example.productservice.serviceview.ProductServiceView;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.spi.DestinationSetter;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.Destination;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceViewImpl implements ProductServiceView {
    private final ProductService productService;
    private final ModelMapper modelMapper;

    @Override
    public ProductReadDTO create(ProductWriteDTO writeDTO) {
        return modelMapper.map(productService
                .save(modelMapper.map(writeDTO, Product.class)), ProductReadDTO.class);
    }

    @Override
    public ProductReadDTO getById(String id) {
        return modelMapper.map(productService.getById(id), ProductReadDTO.class);
    }
}
