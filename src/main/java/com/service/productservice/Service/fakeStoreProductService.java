package com.service.productservice.Service;


import com.service.productservice.DTOs.FakeStoreProductDTO;
import com.service.productservice.Models.Category;
import com.service.productservice.Models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
    public Product getProductById(Long ProductId) {
        FakeStoreProductDTO fakeStoreProductDTO = restTemplate.getForObject("https://fakestoreapi.com/products/" + ProductId,
                FakeStoreProductDTO.class);

        //Convert fakeStoreProductDTo object into product object
        return ConvertFakeStoreProductDtoToProduct(fakeStoreProductDTO);
    }
}
