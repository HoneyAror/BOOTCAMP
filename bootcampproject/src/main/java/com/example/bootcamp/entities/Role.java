package com.example.bootcamp.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity
public class Role {
    @Id
    public Long id;
    public String authority;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

}
