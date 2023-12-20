package id.shellrean.rest;

import id.shellrean.service.*;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.Objects;

@Path("payment")
public class PaymentResource {
    @Inject
    private Payment paymentService;

    @Inject
    private CustomerService customerService;

    @Inject
    private GopayPaymentService gopayPaymentService;

    @Inject
    private CustomService customService;


//    private final Payment paymentService;
//    private final CustomerService customerService;
//
//    public PaymentResource(Payment paymentService, CustomerService customerService) {
//        this.paymentService = paymentService;
//        this.customerService = customerService;
//    }

    @GET
    public Response payment(){
        customService.languages();
        paymentService.execute();
        customerService.customers();
        gopayPaymentService.executeGo();
        return Response.ok().build();
    }
}
