package kitchen;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@RegisterRestClient
public interface kitchenService {

    //    @RolesAllowed("user")
    @POST
    @Path("/test2")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Dish AddDish(Dish dish);


    @GET
    @Path("/test2/me")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    User me();


}
