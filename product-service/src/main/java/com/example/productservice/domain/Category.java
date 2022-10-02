package com.example.productservice.domain;

/*
    @author uurdev
    @date 2.10.2022
*/

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "category")
public class Category extends BaseEntity {

    private String name;
    private String description;
}
