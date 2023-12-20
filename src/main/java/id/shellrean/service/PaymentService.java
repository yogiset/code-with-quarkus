package id.shellrean.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PaymentService implements Payment {
    @Override
    public void execute(){
        System.out.println("Payment Executed");
    }

}
