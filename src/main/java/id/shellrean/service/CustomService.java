package id.shellrean.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Singleton;
import jakarta.ws.rs.Produces;

import java.util.List;

@ApplicationScoped
@Singleton
@RequestScoped
@SessionScoped
@Dependent
public class CustomService {

    public List<Object> languages(){
        return List.of("PHP","Java","JavaScript","Kotlin","Go");
    }

}
