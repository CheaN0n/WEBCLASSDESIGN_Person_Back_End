package com.lrl.classdesign.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class student_user {
    @Id
    private String username;
    private String name;
    private String password;
    private String academy;
    private String grade;
    private String sex;
    private String birthday;
    private String tel;
    private String email;
}
