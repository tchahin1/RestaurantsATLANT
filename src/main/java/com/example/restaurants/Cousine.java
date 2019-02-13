package com.example.restaurants;

import javax.persistence.*;

@Entity
@Table(name = "cousines")
public class Cousine {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Restaurant restaurant;

    @Column(nullable = false)
    private String name;

    public Cousine() {
    }

    public Cousine(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
