package com.codegym.service.customer;

import com.codegym.model.customer.Customer;
import com.codegym.model.customer.CustomerType;
import com.codegym.repository.customer.ICustomerRepository;
import com.codegym.repository.customer.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository;

    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(pageable);
    }

    public Customer save(Customer customer) {
        return iCustomerRepository.save(customer);
    }

    public List<CustomerType> findAllType() {
        return new ArrayList<>(iCustomerTypeRepository.findAll());
    }

    public Customer findById(Integer id) {
        return iCustomerRepository.findById(id).get();
    }

    public List<Customer> d() {
        return iCustomerRepository.findAll();
    }
}
