package com.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
   // @Scope("prototype") // This will create a new instance of PaymentService every time it is requested, means every time it will create the new object of PaymentService class
    // if you want to have a single instance of PaymentService, you can remove the @Scope annotation or set it to "singleton"

    PaymentService paymentService() {
        return new PaymentService();
    }

}
