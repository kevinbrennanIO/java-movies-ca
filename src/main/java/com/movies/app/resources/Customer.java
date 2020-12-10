package com.movies.app.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Customer {

    // class members
    public String name;
    public String address;
    public String email;
    public String customerID;
    public ArrayList<String> linkedAccounts;

    // create a customer
    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.customerID = generateID();
        linkedAccounts = new ArrayList<String>();
    }

    public String generateID() {
        String customerID = UUID.randomUUID().toString();
        return customerID;
    }

    public void saveAccountID(String accountID) {
        linkedAccounts.add(accountID);
    }
}