package com.example.productservice.dto;

/*
    @author uurdev
    @date 10.10.2022
*/

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryReadDTO extends CategoryWriteDTO {
    private String id;
    private String creDate;
}
