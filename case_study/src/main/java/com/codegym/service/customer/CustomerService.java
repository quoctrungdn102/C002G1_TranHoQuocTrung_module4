package com.codegym.service.customer;

import com.codegym.model.Customer.Customer;
import com.codegym.model.Customer.CustomerType;
import com.codegym.repository.customer.ICustomerRepository;
import com.codegym.repository.customer.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository;
    public Page<Customer> findAll(Pageable pageable){
       return iCustomerRepository.findAll(pageable);
    }
    public void save(Customer customer){
        iCustomerRepository.save(customer);
    }
    public List<CustomerType>findAllType(){
        return new ArrayList<>(iCustomerTypeRepository.findAll());
    }
    public Customer findById(Integer id){
        return iCustomerRepository.getById(id);
    }
}
