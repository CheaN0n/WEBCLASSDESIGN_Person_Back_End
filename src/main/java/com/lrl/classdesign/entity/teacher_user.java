package com.lrl.classdesign.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class teacher_user {
    @Id
    private String username;
    private String password;
}
