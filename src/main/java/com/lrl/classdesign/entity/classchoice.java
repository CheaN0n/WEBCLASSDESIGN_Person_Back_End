package com.lrl.classdesign.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class classchoice {

    @Id
    private String coursenumber;
    private String name;
    private float point;
    private String teacher;
    private String timeandplace;
    private String ddl;
    private String tips;
}
