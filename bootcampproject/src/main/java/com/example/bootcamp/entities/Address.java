package com.example.bootcamp.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private  String state;
    private String  country;
    private String addressLine;
    private Integer zipCode;
    private String label;

}
