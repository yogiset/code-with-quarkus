package id.shellrean.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("hello")
public class HelloResource {

    @GET
    @Path("world")
    public Response hello(){
        return Response.ok("Hello world").build();
    }
}
