package com.codegym.controller.customer;

import com.codegym.model.Customer.Customer;
import com.codegym.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/restCustomer")
public class CustomerRestController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("")
    public ResponseEntity<?> displayListBlog() {
        List<Customer> Blogs = iCustomerService.d();
        if (Blogs == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(Blogs, HttpStatus.OK);
        }
    }


    @PostMapping("/create")
    public ResponseEntity<?> createSmartphone(@RequestBody Customer customer) {
//        Page<Customer> customers = iCustomerService.findAll(PageRequest.of(page, 2));
//        List<Customer> customers1 = customers.getContent();
        iCustomerService.save(customer);
        return new ResponseEntity<>( iCustomerService.save(customer),HttpStatus.OK);
    }

    @GetMapping("/findCustomer/{id}")
    public ResponseEntity<?> findCustomerById(@PathVariable("id") Integer id) {
        Customer customer = iCustomerService.findById(id);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

}
