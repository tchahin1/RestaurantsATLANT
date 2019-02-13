package com.example.restaurants;

import javax.persistence.*;

@Entity
@Table(name = "tables")
public class Tables {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private int type;

    @Column
    private int tableNumber;

    @ManyToOne
    private Restaurant restaurant;

//dodati jos manytoone relaciju sa restoranom !!!

    public long getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Tables() {
    }

    public Tables(int type, int tableNumber) {
        this.type = type;
        this.tableNumber = tableNumber;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }
}
