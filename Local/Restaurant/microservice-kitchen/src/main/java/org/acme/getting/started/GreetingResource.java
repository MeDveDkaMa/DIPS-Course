package org.acme.getting.started;

import org.acme.getting.started.bean.Dish;
import org.acme.getting.started.bean.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class GreetingResource {

    @POST
    @Path("/me")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User hello(User user) {
        return user;
    }

    @POST
    @Path("/addDish")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Dish dishAdd(Dish dish) {
        System.out.println("YA TUT");
        System.out.println(dish);
        return dish;
    }

}