package com.service.productservice.Service;

import com.service.productservice.Exceptions.ProductNotFoundException;
import com.service.productservice.Models.Product;

import java.util.List;

public interface ProductService {

    public Product getProductById(Long id) throws ProductNotFoundException;
    public List<Product> getAllProducts();

    public Product createProduct(Product product);

    public Product replaceProduct(int ProductId,Product product) throws ProductNotFoundException;
}
