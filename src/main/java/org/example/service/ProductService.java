package org.example.service;

import org.example.model.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ProductService {
    public void getProductDetails(Product product){
        System.out.println("Product Id : "+product.getId());
        System.out.println("Product Name : "+product.getProductName());
    }
}
