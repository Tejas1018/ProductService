package com.service.productservice.Inheritance.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity(name = "jt_mentors")
@PrimaryKeyJoinColumn(name = "user_id")
public class mentor extends users {
    private String mentorName;
    private String company;
}
