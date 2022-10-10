package com.example.productservice.endpoint;

/*
    @author uurdev
    @date 10.10.2022
*/

import com.example.productservice.dto.CategoryReadDTO;
import com.example.productservice.dto.CategoryWriteDTO;
import com.example.productservice.serviceview.CategoryServiceView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/categories")
public class CategoryController {

    private final CategoryServiceView categoryServiceView;

    @GetMapping(path = "/{categoryId}")
    public ResponseEntity<CategoryReadDTO> getById(@PathVariable String categoryId){
        return ResponseEntity.ok(categoryServiceView.getById(categoryId));
    }

    @PostMapping
    public ResponseEntity<CategoryReadDTO> create(@RequestBody CategoryWriteDTO categoryWriteDTO){
        return ResponseEntity.ok(categoryServiceView.create(categoryWriteDTO));
    }
}
