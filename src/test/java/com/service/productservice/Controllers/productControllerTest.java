package com.service.productservice.Controllers;

import com.service.productservice.Exceptions.ProductNotFoundException;
import com.service.productservice.Models.Product;
import com.service.productservice.Service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class productControllerTest {
    @MockitoBean
    ProductService productService;

   productController productController;

    @Test
    void getProductById() throws ProductNotFoundException {
        Product product = new Product();
        product.setId(1);
        when(productService.getProductById(1L)).thenReturn(product);
        Product result = productController.getProductById(1L);
        assertEquals(1, result.getId());
    }

   /* @Test
    void getProductById_NotFound() {
        try {
            when(productService.getProductById(2L)).thenThrow(new ProductNotFoundException("Not found"));
            controller.getProductById(2L);
            fail("Expected ProductNotFoundException");
        } catch (ProductNotFoundException e) {
            assertEquals("Not found", e.getMessage());
        }
    }

    @Test
    void getAllProducts() {
        Product p1 = new Product();
        Product p2 = new Product();
        List<Product> products = Arrays.asList(p1, p2);
        when(productService.getAllProducts()).thenReturn(products);
        List<Product> result = controller.getAllProducts();
        assertEquals(2, result.size());
    }

    @Test
    void createProduct() {
        Product product = new Product();
        when(productService.createProduct(product)).thenReturn(product);
        Product result = controller.createProduct(product);
        assertEquals(product, result);
    }

    @Test
    void updateProduct() {
        Product product = new Product();
        Product result = controller.updateProduct(1L, product);
        assertNotNull(result);
    }

    @Test
    void replaceProduct() throws ProductNotFoundException {
        Product product = new Product();
        when(productService.replaceProduct(1, product)).thenReturn(product);
        Product result = controller.replaceProduct(1, product);
        assertEquals(product, result);
    }

    @Test
    void replaceProduct_NotFound() {
        Product product = new Product();
        try {
            when(productService.replaceProduct(2, product)).thenThrow(new ProductNotFoundException("Not found"));
            controller.replaceProduct(2, product);
            fail("Expected ProductNotFoundException");
        } catch (ProductNotFoundException e) {
            assertEquals("Not found", e.getMessage());
        }
    }
*/
/*    @Test
    void deleteProduct() {
        controller.deleteProduct(1L);
        verify(productService, times(0)).deleteProduct(anyLong()); // since controller method is empty
    }*/
}