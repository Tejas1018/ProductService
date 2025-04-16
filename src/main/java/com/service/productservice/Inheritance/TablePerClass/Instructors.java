package com.service.productservice.Inheritance.TablePerClass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_instructors")
public class Instructors extends users {
    private String instructorName;
    private String instructorCompany;
}
