package com.example.restaurants;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private Country countryId;

    @Column
    private String name;

    public City() {
    }

    public City(Country countryId, String name) {
        this.countryId = countryId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountryId() {
        return countryId;
    }

    public long getId() {
        return id;
    }
}
