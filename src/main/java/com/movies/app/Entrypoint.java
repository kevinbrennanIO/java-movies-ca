package com.movies.app;
import com.movies.app.handlers.CustomerHandler;
import com.movies.app.handlers.AccountHandler;
import com.movies.app.handlers.MovieHandler;
import com.movies.app.resources.Customer;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class Entrypoint extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> handlers = new HashSet<>();
        handlers.add( CustomerHandler.class );
        handlers.add( MovieHandler.class );
        handlers.add( AccountHandler.class );

        return handlers;
    }
}