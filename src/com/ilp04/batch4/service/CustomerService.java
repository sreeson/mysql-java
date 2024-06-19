package com.ilp04.batch4.service;

import java.util.ArrayList;

import com.ilp04.batch4.entity.Customer;

public interface CustomerService {
    ArrayList<Customer> getAllCustomers();
    Customer getCustomerByCode(int customerCode);
    int insertCustomer(Customer customer);
    int updateCustomer(Customer customer);
}
