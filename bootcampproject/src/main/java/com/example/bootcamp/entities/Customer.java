package com.example.bootcamp.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
public class Customer{
    @Id
    private Long userid;
    private Long contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userid",referencedColumnName = "id")
    private User user;

}
