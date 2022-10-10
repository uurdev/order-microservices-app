package com.example.productservice.endpoint;

/*
    @author uurdev
    @date 10.10.2022
*/

import com.example.productservice.dto.CategoryReadDTO;
import com.example.productservice.dto.CategoryWriteDTO;
import com.example.productservice.dto.ProductReadDTO;
import com.example.productservice.dto.ProductWriteDTO;
import com.example.productservice.serviceview.ProductServiceView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductServiceView productServiceView;

    @GetMapping(path = "/{productId}")
    public ResponseEntity<ProductReadDTO> getById(@PathVariable String productId){
        return ResponseEntity.ok(productServiceView.getById(productId));
    }

    @PostMapping
    public ResponseEntity<ProductReadDTO> create(@RequestBody ProductWriteDTO productWriteDTO){
        return ResponseEntity.ok(productServiceView.create(productWriteDTO));
    }
}
