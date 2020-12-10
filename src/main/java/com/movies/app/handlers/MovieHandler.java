package com.movies.app.handlers;

import com.movies.app.resources.Customer;
import com.movies.app.resources.Movie;
import com.movies.app.resources.Account;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/movie")
public class MovieHandler {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMovie()
    {
        System.out.println("GET /movie called");

        Date date = new Date();
        Movie m1 = new Movie("sdfsdf", date, false, false, "sdfsdfsdfsdfd" );

        System.out.println(m1);

        return Response
                .status(Response.Status.OK)
                .entity(m1)
                .build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response listMovie()
    {
        System.out.println("GET /movie called");

        Date date = new Date();
        Movie m1 = new Movie("sdfsdf", date, false, false, "sdfsdfsdfsdfd" );

        System.out.println(m1);

        return Response
                .status(Response.Status.OK)
                .entity(m1)
                .build();
    }
}
