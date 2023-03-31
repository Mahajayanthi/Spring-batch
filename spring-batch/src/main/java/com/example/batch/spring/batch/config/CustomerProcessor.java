package com.example.batch.spring.batch.config;

import com.example.batch.spring.batch.entity.Customer;
import org.springframework.batch.item.*;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {


    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
//        if(customer.getemail().equals("maha@stgit.com")){
//            return customer;
//        }else{
//            return null;
//        }

    }
}
