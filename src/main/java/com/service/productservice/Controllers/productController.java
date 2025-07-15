package com.service.productservice.Controllers;


import com.service.productservice.Exceptions.ProductNotFoundException;
import com.service.productservice.Models.Product;
import com.service.productservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestControllerAdvice
@RestController
@RequestMapping("/products")
public class productController {

    ProductService productService;

    public productController(@Qualifier("selfProductService") ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {
/*        ResponseEntity<Product> response = null;
        try {
            Product product = productService.getProductById(id);
            response = new ResponseEntity<>(product, HttpStatus.OK);
        }
        catch (ProductNotFoundException e) {
            response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
            throw new ProductNotFoundException(e.getMessage());
        }
        return response;*/
        return productService.getProductById(id);
    }

    @GetMapping()
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    @PostMapping()
    public Product createProduct(@RequestBody Product product){

        return productService.createProduct(product);
    }

    @PatchMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return new Product();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") int id,@RequestBody Product product) throws ProductNotFoundException {
        return productService.replaceProduct(id,product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){

    }

    // To handle exceptions in controller class we can create a exceptions here
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> productNotFoundException(ProductNotFoundException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }
}
