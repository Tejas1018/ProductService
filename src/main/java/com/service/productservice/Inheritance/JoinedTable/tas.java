package com.service.productservice.Inheritance.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity(name = "jt_tas")
@PrimaryKeyJoinColumn(name = "user_id")
public class tas extends users {
    private int noOfHR;
}
