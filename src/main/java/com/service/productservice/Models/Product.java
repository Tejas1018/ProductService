package com.service.productservice.Models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product extends BaseModel {

    private String imageUrl;
    private String name;
    private double price;
    private Category category;
    private String description;

}
