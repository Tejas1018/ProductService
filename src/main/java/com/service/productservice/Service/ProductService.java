package com.service.productservice.Service;

import com.service.productservice.Models.Product;

import java.util.List;

public interface ProductService {

    public Product getProductById(Long id);
    public List<Product> getAllProducts();
}
