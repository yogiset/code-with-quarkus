package id.shellrean.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GopayPaymentService{

    public void executeGo() {
        System.out.println("Payment by gopay");
    }
}
