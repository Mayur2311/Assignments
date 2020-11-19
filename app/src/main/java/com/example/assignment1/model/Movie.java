package com.example.assignment1.model;

public class Movie {

    String movie_title;
    String ratings;
    String Description;


    public Movie(String movie_title, String ratings, String description) {
        this.movie_title = movie_title;
        this.ratings = ratings;
        Description = description;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(String movie_title) {
        this.movie_title = movie_title;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

}
