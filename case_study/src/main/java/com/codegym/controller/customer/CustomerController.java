package com.codegym.controller.customer;

import com.codegym.model.customer.Customer;
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
        model.addAttribute("listCustomerType", iCustomerService.findAllType());
        model.addAttribute("listCustomer", iCustomerService.findAll(PageRequest.of(page, 7)));
        model.addAttribute("customer",new Customer());
        return "customer/home";
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
//    @GetMapping("/edit/{id}")
//    public String findById(@PathVariable("id") Integer id,Model m) {
//       m.addAttribute("Customer",iCustomerService.findById(id));
//        m.addAttribute("listCustomerType", iCustomerService.findAllType());
//        return "customer/creat";
//    }

}
