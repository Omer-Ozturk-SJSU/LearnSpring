package com.example.LearnSpring.product.model;

import jakarta.persistence.*;
// import lombok.Data;

@Entity // maps java class to mysql
//@Data // NOT WORKING LOMBOK BROKEN
@Table(name="product")
public class Product {

    @Id // all tables in mySQL need a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto generates id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // THIS SUCKS. Should use Lombok. Just not working
    public Product() {
    }
}
