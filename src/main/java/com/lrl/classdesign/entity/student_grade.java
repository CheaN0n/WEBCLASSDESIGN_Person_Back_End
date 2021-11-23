package com.lrl.classdesign.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class student_grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String stuname;
    private String coursenumber;
    private String name;
    private float point;
    private String teacher;
    private String timeandplace;
    private String tips;
    private String classgrade;
}
