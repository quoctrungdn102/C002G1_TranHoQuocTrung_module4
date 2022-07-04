package com.codegym.service.customer;

import com.codegym.model.Customer.Customer;
import com.codegym.model.Customer.CustomerType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface ICustomerService {
    public Page<Customer> findAll(Pageable pageable);

    public Customer save(Customer customer);

    public List<CustomerType> findAllType();

    public Customer findById(Integer id);
    public List<Customer> d();


    }
