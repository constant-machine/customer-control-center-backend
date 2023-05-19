package com.constantmachine.customercontrolcenter.service;

import com.constantmachine.customercontrolcenter.dao.entity.Customer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("dbless")
public class MockedCustomerService implements CustomerService {

    private final Customer richard = Customer.builder()
            .id(123L)
            .userName("Richard")
            .contact("88005553535")
            .build();

    private final Customer pete = Customer.builder()
            .id(124L)
            .userName("Pete")
            .contact("555-2368")
            .build();

    @Override
    public Customer getCustomer(Long id) {
        return richard;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customer;
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customer;
    }

    @Override
    public List<Customer> listCustomers() {
        return List.of(richard, pete);
    }

    @Override
    public void deleteCustomer(Customer customer) {
    }
}
