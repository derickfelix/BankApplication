/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bankapplication.controller;

import com.bankapplication.model.Customer;
import com.bankapplication.respository.impl.CustomerRepository;
import java.util.ArrayList;

/**
 * @name CustomerController
 * @author derickfelix
 * @date Sep 26, 2017
 */
public class CustomerController {
    
    private CustomerRepository customerRepository;
    
    public CustomerController() {
        this.customerRepository = new CustomerRepository();
    }
    public void store(Customer customer) {
        customerRepository.store(customer);
    }

    public ArrayList<Customer> getCustomers() {
        return customerRepository.all();
    }
}