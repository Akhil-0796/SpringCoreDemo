package org.example;

import org.example.model.Product;
import org.example.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        ApplicationContext factory  = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = factory.getBean(ProductService.class);

        productService.getProductDetails(product);

    }
}
