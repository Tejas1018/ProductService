package com.service.productservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "products")
public class Product extends BaseModel {

    private String imageUrl;
    private String name;
    private double price;
    @ManyToOne
    private Category category;
    private String description;

}
