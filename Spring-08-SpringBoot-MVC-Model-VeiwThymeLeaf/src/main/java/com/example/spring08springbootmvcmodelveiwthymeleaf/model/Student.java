package com.example.spring08springbootmvcmodelveiwthymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
model package - often called enity
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

    private int id;
    private String firstName;
    private String lastName;
}
