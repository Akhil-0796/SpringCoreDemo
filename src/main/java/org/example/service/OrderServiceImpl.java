package org.example.service;

import lombok.var;
import org.example.model.Order;
import org.example.service.interfaces.OrderServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderServiceInterface {
    @Override
    public void getOrderDetails(List<Order> orderList) {
        System.out.println("Here is the Order Details.");
        for (var order:orderList) {
            System.out.println("Product Id : "+order.getOrderId());
            System.out.println("Product value : "+order.getPurchaseValue());
        }
    }
}
