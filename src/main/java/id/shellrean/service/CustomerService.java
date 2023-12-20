package id.shellrean.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerService {
    public void customers(){
        System.out.println("Hello from customer !");
    }
}
