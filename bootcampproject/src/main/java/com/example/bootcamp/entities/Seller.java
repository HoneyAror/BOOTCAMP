package com.example.bootcamp.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Seller{
    @Id
    private Long userid;
    private  String gst;
    private int companyContact;
    private String  companyName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userid",referencedColumnName = "id")
    private User user;

}
