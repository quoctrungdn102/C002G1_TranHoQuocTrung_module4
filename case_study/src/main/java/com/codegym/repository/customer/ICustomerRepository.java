package com.codegym.repository.customer;

import com.codegym.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
}
