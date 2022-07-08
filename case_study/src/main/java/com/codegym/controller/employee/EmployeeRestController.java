package com.codegym.controller.employee;

import com.codegym.model.employee.Employee;
import com.codegym.service.employee.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resEmployee")
public class EmployeeRestController {
    @Autowired
    private IEmployeeService iEmployeeService;
    @GetMapping("")
    public ResponseEntity<?> displayListEmployee(){
        return new ResponseEntity<>(iEmployeeService.employeeList(),HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> creatEmployee(@RequestBody Employee employee) {
        return new ResponseEntity<>(iEmployeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @GetMapping("/findEmployee/{id}") 
    public ResponseEntity<?> findEmployee(@PathVariable("id") Integer id) {
        Employee employee =iEmployeeService.findEmployeeById(id).get();
        return new ResponseEntity<>(employee,HttpStatus.OK);
    }

}
