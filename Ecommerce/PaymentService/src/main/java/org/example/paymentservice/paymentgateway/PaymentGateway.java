package org.example.paymentservice.paymentgateway;

public interface PaymentGateway {
    String getPaymentLink(Long amount,String email,String phoneNumber,String orderId);
}
