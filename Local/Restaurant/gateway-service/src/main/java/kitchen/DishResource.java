package kitchen;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class DishResource {

    @Inject
    @RestClient
    kitchenService kitchenService;

//    @Inject
//    SecurityIdentity securityIdentity;

    @POST
    @Path("/addDish")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Dish addDish(Dish dish) {
        return kitchenService.AddDish(dish);
    }


    @POST
    @Path("/me")
//    @RolesAllowed("user")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User me(User user) {
        return kitchenService.me(user);
    }

    @GET
    @Path("/{number}")
    @Produces("text/plain")
    public String addDish(@PathParam long number) {
        return kitchenService.metric(number);
    }

}
