package org.example.paymentservice.controllers;

import org.example.paymentservice.dtos.InitiatePaymentDto;
import org.example.paymentservice.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentDto initiatePaymentDto) {
       return paymentService.initiatePayment(initiatePaymentDto.getAmount(),initiatePaymentDto.getEmail(),initiatePaymentDto.getPhoneNumber(),initiatePaymentDto.getOrderId());
    }
}
