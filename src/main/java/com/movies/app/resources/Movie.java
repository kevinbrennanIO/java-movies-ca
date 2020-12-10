package com.movies.app.resources;

import java.util.Date;

public class Movie {


    // class members
    private String name;
    private Date releaseDate;
    private boolean hasBeenWatched;
    private boolean isRecommended;
    private String summary;

    // create a movie
    public Movie(String name, Date releaseDate, boolean hasBeenWatched, boolean isRecommended, String summary) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.hasBeenWatched = hasBeenWatched;
        this.isRecommended = isRecommended;
        this.summary = summary;
    }
}
