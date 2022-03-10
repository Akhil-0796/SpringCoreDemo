package org.example;
import org.example.service.CustomerServiceImpl;
import org.example.service.OrderServiceImpl;
import org.example.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
