package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSpringbootTutorialApplication implements CommandLineRunner {

    @Autowired
    PaymentService paymentService;

    @Autowired
    PaymentService paymentService1;

	public static void main(String[] args) {
		SpringApplication.run(SpringSpringbootTutorialApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {

        // checking for scope of the bean, if it is singleton or prototype
        // by default, the scope of the bean is singleton, so both paymentService and paymentService1 will have the same hashcode
        System.out.println(paymentService.hashCode());
        System.out.println(paymentService1.hashCode());

        paymentService.getPaymentDetails();
        paymentService1.getPaymentDetails();
    }
}
