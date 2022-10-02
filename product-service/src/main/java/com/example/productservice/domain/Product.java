package com.example.productservice.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.math.BigDecimal;

/*
    @author uurdev
    @date 2.10.2022
*/
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "product")
public class Product extends BaseEntity{

    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumnOrFormula(column = @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID"))
    private Category category;
    private BigDecimal price;
    private BigDecimal taxKdv;
}
