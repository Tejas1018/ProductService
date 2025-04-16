package com.service.productservice.Inheritance.mappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "msc_mentors")
public class mentors extends users{
    private String mentorName;
    private String company;
}
