package org.example.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class Product {
    public Product(int id, String productName, Double price, Double rating, int categoryType, List<String> imagePaths, Double discount, List<String> specifications) {
        Id = id;
        this.productName = productName;
        this.price = price;
        this.rating = rating;
        this.categoryType = categoryType;
        this.imagePaths = imagePaths;
        this.discount = discount;
        this.specifications = specifications;
    }

    private int Id;
    private String productName;
    private Double price;
    private Double rating;
    private int categoryType;
    private List<String> imagePaths;
    private Double discount;
    private List<String> specifications;
}
