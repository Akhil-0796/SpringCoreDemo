package org.example.service;

import org.example.model.Customer;
import org.example.model.Order;
import org.example.service.interfaces.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Component
public class CustomerServiceImpl implements CustomerServiceInterface {
    @Autowired
    OrderServiceImpl orderService;
    @Autowired
    DataSource dataSource;
    private Customer customer;

    @Override
    public void getCustomerDetails(Customer customer) {
        this.customer = customer;
        System.out.println("-------------------------------");
        System.out.println("Name : " + customer.getCustomerName());
        System.out.println("Email :" + customer.getCustomerEmail());
        System.out.println("Phone : " + customer.getCustomerMobileNumber());
        System.out.println("Address : " + customer.getAddressList().get(0));
        System.out.println("-------------------------------");
    }

    public void help(){
        System.out.println("edcdcjsdhcjkhsdvjchsjvgfsjvgfjgve");
    }

    @Override
    public void getOrderDetails(Customer customer) {
        orderService.getOrderDetails(customer.getOrderList());
    }

    @PostConstruct
    void postConstruct() {
        System.out.println("Order Details are ready");
    }

    @PreDestroy
    void preDestroy() {
        System.out.println("****************************");
        System.out.println("Thank you " + customer.getCustomerName() + " for visiting our site.");
    }

    public String getCustomerById(int customerId) {
        String name = "";
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from customer where id =" + customerId);
            while (resultSet.next()) {
                name = resultSet.getString("name");
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }
}
