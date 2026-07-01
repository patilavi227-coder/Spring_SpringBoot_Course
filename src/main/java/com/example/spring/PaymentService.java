package com.example.spring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Service
//@Repository
//@Controller
public class PaymentService {

    public void getPaymentDetails() {
        System.out.println("Getting payment detailsssssssss...");
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("Before payment...");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("After payment is done...");
    }

}
