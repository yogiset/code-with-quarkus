package id.shellrean.rest;

import id.shellrean.dto.Karyawan;
import id.shellrean.dto.UserData;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Path("karyawan")
public class KaryawanResource {

    private List<Karyawan> userkaryawan = new ArrayList<>();

    @Path("all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllKaryawan(){
        return Response.ok(userkaryawan).build();
    }

    @Path("add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createKaryawan(Karyawan karyawan){
      userkaryawan.add(karyawan); //buat array
         return Response.created(URI.create("/userkaryawan/"+karyawan.getKodekaryawan())).build();
    }

}
