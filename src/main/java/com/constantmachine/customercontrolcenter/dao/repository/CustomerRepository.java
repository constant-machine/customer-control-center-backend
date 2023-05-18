package com.constantmachine.customercontrolcenter.dao.repository;

import com.constantmachine.customercontrolcenter.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
