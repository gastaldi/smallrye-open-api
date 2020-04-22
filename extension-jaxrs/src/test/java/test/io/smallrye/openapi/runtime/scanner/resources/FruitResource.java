package test.io.smallrye.openapi.runtime.scanner.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import test.io.smallrye.openapi.runtime.scanner.entities.Fruit;

@Path("/hello")
public class FruitResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @APIResponse(
            content = @Content(mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(implementation = Fruit.class, required = true)))
    public Response hello() {
        return Response.ok(new Fruit("Banana", "Yellow")).build();
    }
}
