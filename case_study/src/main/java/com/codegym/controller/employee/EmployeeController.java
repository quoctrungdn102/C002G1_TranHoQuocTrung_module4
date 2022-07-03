package com.codegym.controller.employee;

import com.codegym.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
    @GetMapping("")
    public String findAllEmployee(@RequestParam(name = "page",defaultValue = "0") Integer page, Model model){
      model.addAttribute("Employees", iEmployeeService.findAll(PageRequest.of(page,2)));
      model.addAttribute("Divisions", iEmployeeService.findAllDivision());
      model.addAttribute("Educations", iEmployeeService.findAllEducation());
      model.addAttribute("Positions", iEmployeeService.findAllPosition());
        return "employee/home";
    }

}
