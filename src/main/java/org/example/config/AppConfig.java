package org.example.config;
import org.example.model.Customer;
import org.example.service.CustomerServiceImpl;
import org.example.service.OrderServiceImpl;
import org.example.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean("product")
    public ProductServiceImpl getProductService(){
        return new ProductServiceImpl();
    }

    @Bean
    public CustomerServiceImpl getCustomerService(){
        return new CustomerServiceImpl();
    }
    @Bean
    public OrderServiceImpl getOrderServiceImpl(){return new OrderServiceImpl();};
    @Bean("customer")
    public Customer getCustomer(){return new Customer(101,"Akhil", new ArrayList<String>(Arrays.asList("2094/7GA New Delhi-110008")),"8285672135","akhil.mumgain@digit88.com","123Aa@"); }
}
