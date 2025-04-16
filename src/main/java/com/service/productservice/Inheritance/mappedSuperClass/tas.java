package com.service.productservice.Inheritance.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_tas")
public class tas extends users{
    private int noOfHR;
}
