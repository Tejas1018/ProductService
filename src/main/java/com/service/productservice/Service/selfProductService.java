package com.service.productservice.Service;

import com.service.productservice.Exceptions.ProductNotFoundException;
import com.service.productservice.Models.Category;
import com.service.productservice.Models.Product;
import com.service.productservice.Repository.CategoryRepository;
import com.service.productservice.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("selfProductService")
public class selfProductService implements ProductService {
    ProductRepository  productRepository;
    CategoryRepository categoryRepository;
    selfProductService(ProductRepository productRepository,CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        Optional<Product> product = productRepository.findById(id);
        if(product.isEmpty()){
            throw new ProductNotFoundException("Product not found in Database");
        }
        return product.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    public Product createProduct(Product product) {
        Category category = product.getCategory();
        //if this category doesn't present in DB
        //Create a category save the categroy in DB
        Optional<Category> optionalCategory = categoryRepository.findByName(category.getName());
        if(optionalCategory.isEmpty()){
            category = categoryRepository.save(category);
        }
        product.setCategory(category);
        return productRepository.save(product);
    }

    @Override
    public Product replaceProduct(int ProductId, Product product) throws ProductNotFoundException {
        Optional<Product> productOptional = productRepository.findById(ProductId);
        if(productOptional.isEmpty()){
            throw new ProductNotFoundException("Product not found in Database");
        }

        Product productFromDB = productOptional.get();
        productFromDB.setName(product.getName());
        productFromDB.setDescription(product.getDescription());
        productFromDB.setPrice(product.getPrice());

        Category category = product.getCategory();
//        if(category.getId() == null){
//            category = categoryRepository.save(category);
//        }
        productFromDB.setCategory(category);
        return productRepository.save(productFromDB);
    }

}
