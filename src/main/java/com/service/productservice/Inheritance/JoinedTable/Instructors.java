package com.service.productservice.Inheritance.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_Instructors")
@PrimaryKeyJoinColumn(name = "user_id")
public class Instructors extends users {
    private String instructorName;
    private String instructorCompany;
}
