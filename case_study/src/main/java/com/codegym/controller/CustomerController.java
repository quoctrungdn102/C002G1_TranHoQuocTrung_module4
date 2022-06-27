package com.codegym.controller;

import com.codegym.model.Customer.Customer;
import com.codegym.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("/")
    public String listCustomer(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
//        Sort sort = Sort.by("name_blog").ascending();
        model.addAttribute("listCustomer", iCustomerService.findAll(PageRequest.of(page, 2)));
        return "customer/index";
    }

    @GetMapping("/create")
    public String goCreatCustomer(Model model) {
        model.addAttribute("Customer", new Customer());
        model.addAttribute("listCustomerType", iCustomerService.findAllType());
        return "customer/creat";
    }
    @PostMapping("/create")
    public String creat(Customer customer){
        iCustomerService.save(customer);
        return "redirect:/customer";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") Integer id) {
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public String goFormEdit(@PathVariable("id") Integer id, Model model) {
        Customer customer = iCustomerService.findById(id);
        model.addAttribute("Customer", customer);
        model.addAttribute("listCustomerType", iCustomerService.findAllType());

        return "customer/creat";
    }

}
