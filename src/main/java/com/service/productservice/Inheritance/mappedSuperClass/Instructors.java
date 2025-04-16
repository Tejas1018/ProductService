package com.service.productservice.Inheritance.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_instructor")
public class Instructors extends users{
    private String instructorName;
    private String instructorCompany;
}
