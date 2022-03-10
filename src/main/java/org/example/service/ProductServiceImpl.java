package org.example.service;

import org.example.model.Product;
import org.example.service.interfaces.ProductServiceInterface;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class ProductServiceImpl implements ProductServiceInterface {
    public void getProductDetails(Product product){
        System.out.println("Product Id : "+product.getId());
        System.out.println("Product Name : "+product.getProductName());
    }
}
