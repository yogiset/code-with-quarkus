package id.shellrean.rest;

import id.shellrean.dto.UserData;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.net.URI;
import java.util.*;

@Path("users")
public class UserResource {
 //  private List<UserData> users = new ArrayList<>();
    private Map<String, UserData> users = new HashMap<>();

    @Path("all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers(){
        return Response.ok(users).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(UserData user){
    //    users.add(user); //buat array
        users.put(user.getEmail(), user); // buat hashmap
        return Response.created(URI.create("/users/"+user.getEmail())).build();
    }

    @Path("{email}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(String email){
        UserData user = users.get(email);
        if(Objects.isNull(user)){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(user).build();
    }
}
