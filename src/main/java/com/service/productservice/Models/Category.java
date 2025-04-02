package com.service.productservice.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "categories")
public class Category extends BaseModel {
    private String name;
}
