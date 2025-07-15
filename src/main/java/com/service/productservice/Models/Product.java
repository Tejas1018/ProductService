package com.service.productservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "products")
public class Product extends BaseModel {
    private String name;
    private String imageUrl;
    private double price;
    private String description;
    @ManyToOne
    private Category category;


}
