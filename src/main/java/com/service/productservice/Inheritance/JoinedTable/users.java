package com.service.productservice.Inheritance.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "jt_users")
@Inheritance(strategy = InheritanceType.JOINED)
public class users {
    @Id
    private int id;
    private String email_id;
    private int password;
}
