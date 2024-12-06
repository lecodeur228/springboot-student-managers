package com.school.student_management.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "students")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter @Getter
    private Long id;
    @Setter @Getter
    private String firstName;
    @Setter @Getter
    private String lastName;
    @Setter @Getter
    private Integer age;
    @Setter @Getter
    private String phone;
}