package com.constantmachine.customercontrolcenter.service;

import com.constantmachine.customercontrolcenter.dao.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface CustomerService {
    Customer getCustomer(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    List<Customer> listCustomers();
    void deleteCustomer(Customer customer);
}
