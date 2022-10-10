package com.example.productservice.dto;

/*
    @author uurdev
    @date 10.10.2022
*/

import com.example.productservice.domain.Category;
import com.example.productservice.domain.Product;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductWriteDTO {
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal taxKdv;
    private String categoryId;

    @Component
    public static class WriteDTOMapper{
        @Autowired
        private ModelMapper modelMapper;
        public void prepare(){
            TypeMap<ProductWriteDTO, Product> typeMap = modelMapper.createTypeMap(ProductWriteDTO.class,
                    Product.class);
            Converter<ProductWriteDTO, Product> converter = mappingContext -> {
                ProductWriteDTO source = mappingContext.getSource();
                Product destination = mappingContext.getDestination();

                if(source.getCategoryId() != null){
                    destination.setCategory(new Category());
                    destination.getCategory().setId(source.getCategoryId());
                }
                return destination;
            };
            typeMap.setPostConverter(converter);
        }
    }
}
