package org.example.model;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private long orderId;
    private Double purchaseValue;
    private Date orderDate;
    private Date expectedDeliveryDate;
    private Customer customer;
    private Product product;

    public Order(long orderId, Double purchaseValue, Product product) {
        this.orderId = orderId;
        this.purchaseValue = purchaseValue;
        this.product = product;
    }
}
