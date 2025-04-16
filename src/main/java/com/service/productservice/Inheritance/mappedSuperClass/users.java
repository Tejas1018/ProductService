package com.service.productservice.Inheritance.mappedSuperClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass

public class users {
    @Id
    private int id;
    private String email_id;
    private int password;
}
