package com.example.rentalcars.model.entity;

import javax.persistence.*;
@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity{

    @Column(nullable = false)
    private String name;


}
