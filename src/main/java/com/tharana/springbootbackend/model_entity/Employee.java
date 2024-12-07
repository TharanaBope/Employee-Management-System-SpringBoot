package com.tharana.springbootbackend.model_entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="employees") // to map this class to the employees table in the database
@Entity // to make this class as an entity
@Data // to generate the getters and setters
public class Employee {
    @Id // to make this field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private long id;

    @Column(name="first_name",nullable = false) // to map this field to the first_name column in the database
    private String firstName;

    @Column(name="last_name",nullable = false) // to map this field to the last_name column in the database
    private String lastName;

    @Column(name="email",nullable = false) // to map this field to the email column in the database
    private String email;
}
