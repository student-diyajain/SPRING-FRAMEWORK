package com.spring.aop.service;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public void makePayment() {
        System.out.println(">>> making payment...");
    }
}

