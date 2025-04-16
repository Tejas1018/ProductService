package com.service.productservice.Service;

import com.service.productservice.Exceptions.ProductNotFoundException;
import com.service.productservice.Models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("selfProductService")
public class selfProductService implements ProductService {
    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
