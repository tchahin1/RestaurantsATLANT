package com.example.restaurants;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    private User user;

    @Column
    private String comment;

    @Column(nullable = false)
    private int rating;

    public Review() {
    }

    public Review(String comment, int rating) {
        this.comment = comment;
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
