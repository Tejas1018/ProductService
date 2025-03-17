package com.service.productservice.DTOs;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductDTO {

    private Long id;

    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
