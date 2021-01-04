package kitchen;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@RegisterRestClient
public interface kitchenService {

    //    @RolesAllowed("user")
    @POST
    @Path("/api/addDish")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Dish AddDish(Dish dish);


    @POST
    @Path("/api/me")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    User me(User user);


}
