package com.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment( ))")
    public void printBefore() {
        System.out.println(">>> payment started");
        System.out.println(">>> payment continue...");
    }
    
    @After("execution(* com.spring.aop.service.PaymentServiceImpl.makePayment(..))")
    public void printAfter() {
        System.out.println(">>> payment End");
    }
}

