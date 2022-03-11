package org.example;

import org.example.config.AppConfig;
import org.example.model.Customer;
import org.example.model.Order;
import org.example.model.Product;
import org.example.service.CustomerServiceImpl;
import org.example.service.OrderServiceImpl;
import org.example.service.ProductServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // xml file based
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // ProductService productService = (ProductService) context.getBean();

        Product product = new Product(101,"SamsungA52s",33000.0,4.3,123,null,null,null);
        Customer customer =  new Customer(101,"Akhil", new ArrayList<String>(Arrays.asList("2094/7GA New Delhi-110008")),"8285672135","akhil.mumgain@digit88.com","123Aa@");
        customer.setOrderList(Arrays.asList(new Order(123,1200.0,product)));
        AnnotationConfigApplicationContext factory  = new AnnotationConfigApplicationContext(AppConfig.class);

        // annotation based
//        ProductServiceImpl productServiceImpl = factory.getBean(ProductServiceImpl.class);
//        productServiceImpl.getProductDetails(product);

        CustomerServiceImpl customerService = factory.getBean(CustomerServiceImpl.class);
        customerService.getCustomerDetails(customer);

        // Auto wiring
        customerService.getOrderDetails(customer);

        // @Service annotation
        OrderServiceImpl orderService = factory.getBean(OrderServiceImpl.class);
        orderService.getOrderDetails(Arrays.asList(new Order(123,1200.0,product)));

        // factory method
        ProductServiceImpl productService = (ProductServiceImpl) factory.getBean("product");
        productService.getProductDetails(product);

        // @Import example
        Customer customer1 = (Customer) factory.getBean("customer");
        System.out.printf("Email : "+customer1.getCustomerEmail());

        factory.close();

    }
}
