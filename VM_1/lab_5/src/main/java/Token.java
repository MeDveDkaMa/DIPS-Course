import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.jwt.JsonWebToken;
import io.quarkus.oidc.IdToken;
import io.quarkus.security.Authenticated;

@Path("/web-app")
@Authenticated
public class Token {

    @Inject
    @IdToken
    JsonWebToken idToken;

    @GET
    public String getUserName() {
        return idToken.getName();
    }
}