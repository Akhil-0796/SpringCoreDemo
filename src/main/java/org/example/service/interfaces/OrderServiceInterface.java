package org.example.service.interfaces;

import org.example.model.Order;

import java.util.List;

public interface OrderServiceInterface {
    void getOrderDetails(List<Order> orderList);
}
