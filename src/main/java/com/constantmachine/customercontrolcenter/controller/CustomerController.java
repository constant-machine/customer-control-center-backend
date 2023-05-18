package com.constantmachine.customercontrolcenter.controller;

import com.constantmachine.customercontrolcenter.dao.entity.Customer;

import java.util.List;

public interface CustomerController {

    Customer getCustomer(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    List<Customer> listCustomers();
    void deleteCustomer(Customer customer);
}
