package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggerHelper {

    @Before("execution(public void getCustomerDetails(Customer customer))")
    public void log(){
        System.out.printf("____________Thanks for visiting");
    }
}
