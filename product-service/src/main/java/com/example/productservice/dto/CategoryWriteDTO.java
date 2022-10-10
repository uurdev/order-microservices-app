package com.example.productservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/*
    @author uurdev
    @date 10.10.2022
*/
@Getter
@Setter
public class CategoryWriteDTO {
    @NotNull
    private String name;
    @NotNull
    private String description;
}
