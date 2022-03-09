package org.example;

import org.example.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductService getProductService(){
        return new ProductService();
    }
}
