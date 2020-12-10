package com.movies.app.resources;

import java.util.ArrayList;
import java.util.UUID;

public class Account {

    // class members
    public String accountID;
    public String username;
    public String password;
    public String customerID;
//    public ArrayList<Movie> rentedMovies;

    public Account() {

    }

    // create an account
    public Account(String username, String password) {
        this.accountID = generateID();
        this.username = username;
        this.password = password;
//        rentedMovies = new ArrayList<Movie>();
    }

    public String generateID() {
        String accountID = UUID.randomUUID().toString();
        return accountID;
    }
}
