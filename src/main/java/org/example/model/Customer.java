package org.example.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {
    private int customerId;
    private String customerName;
    private List<String> addressList;
    private String customerMobileNumber;
    private String customerEmail;
    private String password;
    private List<Order> orderList= new ArrayList<>();

    public Customer(int customerId, String customerName, List<String> addressList, String customerMobileNumber, String customerEmail, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.addressList = addressList;
        this.customerMobileNumber = customerMobileNumber;
        this.customerEmail = customerEmail;
        this.password = password;
    }
}
