package com.service.productservice.Inheritance.TablePerClass;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class mentor extends users {
    private String mentorName;
    private String company;
}
