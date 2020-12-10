package com.movies.app.handlers;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.movies.app.resources.Customer;
import com.movies.app.resources.Movie;
import com.movies.app.resources.Account;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("customer")
public class CustomerHandler {

    ArrayList<Customer> allCustomers = new ArrayList<Customer>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getCustomer() throws JsonProcessingException, InterruptedException {
        System.out.println("GET /customer called");
        String customer = "customer get request";

        return Response
                .status(Response.Status.OK)
                .entity(customer)
                .build();
    }

//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Response createAccount() throws JsonProcessingException {
//
//        // validate customer exists (by ID)
//
//        // create a new account for that customer
//        // return the account number
//        Account account = new Account(username, password);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String resp = objectMapper.writeValueAsString(account);
//
//        return Response
//                .status(Response.Status.OK)
//                .entity(resp)
//                .build();
//    }
//}

    @GET
    @Path("seed")
    @Produces(MediaType.APPLICATION_JSON)
    public Response seed() throws JsonProcessingException {
        Customer customer1 = new Customer("Kevin", "123 Brennan Street", "kevin@brennan.com");
        Customer customer2 = new Customer("Mark", "456 Kelly Street", "mark@kelly.com");
        Customer customer3 = new Customer("Lorcan", "789 Murray Street", "lorcan@murray.com");


        allCustomers.add(customer1);
        allCustomers.add(customer2);
        allCustomers.add(customer3);

        ObjectMapper objectMapper = new ObjectMapper();
        String resp = objectMapper.writeValueAsString(allCustomers);

        return Response
                .status(Response.Status.OK)
                .entity(resp)
                .build();
    }

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAll() throws JsonProcessingException {

        ArrayList<Customer> all = getCustomers();
        ObjectMapper objectMapper = new ObjectMapper();
        String resp = objectMapper.writeValueAsString(all);
        return Response
                .status(Response.Status.OK)
                .entity(resp)
                .build();
    }

    public ArrayList<Customer> getCustomers() {
        return allCustomers;
    }
}
