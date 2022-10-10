package com.example.productservice.dto;

import lombok.Getter;
import lombok.Setter;

/*
    @author uurdev
    @date 10.10.2022
*/
@Getter
@Setter
public class ProductReadDTO extends ProductWriteDTO {
    private String id;
    private String creDate;
}
