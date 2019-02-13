package com.example.restaurants;

import javax.persistence.*;

@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String timeFrom;

    @Column(nullable = false)
    private String timeTo;

    @ManyToOne
    private User user;

    @ManyToOne
    private Tables table;

    public long getId() {
        return id;
    }

    public Reservations() {
    }

    public Reservations(String timeFrom, String timeTo) {
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public User getUser() {
        return user;
    }

    public Tables getTable() {
        return table;
    }
}
