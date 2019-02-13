package com.example.restaurants;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private int stars;

    @Column
    private int pricing;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int reservationInterval;

    public Restaurant() {
    }

    public long getId() {
        return id;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPricing() {
        return pricing;
    }

    public void setPricing(int pricing) {
        this.pricing = pricing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReservationInterval() {
        return reservationInterval;
    }

    public void setReservationInterval(int reservationInterval) {
        this.reservationInterval = reservationInterval;
    }
}
