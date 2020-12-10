package com.movies.app.handlers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.movies.app.resources.Customer;
import com.movies.app.resources.Movie;
import com.movies.app.resources.Account;


import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.ws.RequestWrapper;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Path("/account")
public class AccountHandler extends CustomerHandler {

//    @FormParam("username")
//    public String username;
//
//    @FormParam("password")
//    public String password;
//
//    @FormParam("customerID")
//    public int customerID;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createAccount(Account a) throws JsonProcessingException {

        // create new account
        Account newAccount = new Account(a.username, a.password);

        // validate customer exists (by ID)
        allCustomers = getCustomers();
        for (Customer c : allCustomers) {
            if (c.customerID == a.customerID) {

                // save the new account number to customer object
                c.saveAccountID(newAccount.accountID);

            }
        }
        // return the account number
        ObjectMapper objectMapper = new ObjectMapper();
        String resp = objectMapper.writeValueAsString(newAccount);

        return Response
                .status(Response.Status.OK)
                .entity(resp)
                .build();
    }
}