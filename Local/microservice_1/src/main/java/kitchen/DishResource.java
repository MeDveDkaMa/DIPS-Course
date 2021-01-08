package kitchen;

import org.eclipse.microprofile.rest.client.inject.RestClient;

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


    @GET
    @Path("/me")
    @RolesAllowed("usser")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User me() {
        return kitchenService.me();
    }


}
