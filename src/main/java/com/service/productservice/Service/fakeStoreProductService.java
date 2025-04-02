package com.service.productservice.Service;


import com.service.productservice.DTOs.FakeStoreProductDTO;
import com.service.productservice.Exceptions.ProductNotFoundException;
import com.service.productservice.Models.Category;
import com.service.productservice.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class fakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;
    public fakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product ConvertFakeStoreProductDtoToProduct(FakeStoreProductDTO fakeStoreProductDTO) {
        Product product = new Product();
        product.setId(fakeStoreProductDTO.getId());
        product.setName(fakeStoreProductDTO.getTitle());
        product.setDescription(fakeStoreProductDTO.getDescription());
        product.setPrice(fakeStoreProductDTO.getPrice());
        product.setImageUrl(fakeStoreProductDTO.getImage());
//        Category category = new Category();
//        category.setName(fakeStoreProductDTO.getCategory());
        Category category = new Category();
        category.setName(fakeStoreProductDTO.getCategory());
        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(Long ProductId) throws ProductNotFoundException {
        FakeStoreProductDTO fakeStoreProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products/" + ProductId,
                FakeStoreProductDTO.class);
        if(fakeStoreProductDTO == null){
            throw new ProductNotFoundException("product with given id " + ProductId + " doestn't exist.");
        }
        //Convert fakeStoreProductDTo object into product object
        return ConvertFakeStoreProductDtoToProduct(fakeStoreProductDTO);
    }

    @Override
    public List<Product>  getAllProducts() {

        FakeStoreProductDTO[] fakeStoreProductDTOS = restTemplate.getForObject("https://fakestoreapi.com/products/",
                FakeStoreProductDTO[].class);

        List<Product> products = new ArrayList<>();

        for(FakeStoreProductDTO fakeStoreProductDTO : fakeStoreProductDTOS) {
            products.add(ConvertFakeStoreProductDtoToProduct(fakeStoreProductDTO));
        }
        return products;
    }
}
