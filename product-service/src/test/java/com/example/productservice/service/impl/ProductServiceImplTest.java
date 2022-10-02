package com.example.productservice.service.impl;

import com.example.productservice.domain.Product;
import com.example.productservice.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

/*
    @author uurdev
    @date 2.10.2022
*/
@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @Test
    public void testCreate_it_should_create_new_product_send_valid_request(){
        //Given
        final var mockProduct = Mockito.mock(Product.class);
        final var expectedProduct = mockProduct;

        when(productRepository.save(any(Product.class)))
                .thenReturn(mockProduct);

        //When
        productService.save(mockProduct);

        //Then
        verify(productRepository).save(expectedProduct);
    }

    @Test
    public void testGetById_it_should_throw_exception_when_send_un_found_record(){
        //Given
        final var id = "PROD-001";
        given(productRepository.findById(anyString()))
                .willThrow(RuntimeException.class);

        doThrow(new RuntimeException())
                .when(productService)
                .getById(id);
    }

}