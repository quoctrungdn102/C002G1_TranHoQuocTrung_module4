package com.codegym.service.employee;

import com.codegym.model.employee.Division;
import com.codegym.model.employee.EducationDegree;
import com.codegym.model.employee.Employee;
import com.codegym.model.employee.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Page<Employee> findAll(Pageable pageable);

    List<Position> findAllPosition();

    List<EducationDegree> findAllEducation();

    List<Division> findAllDivision();

    Employee saveEmployee(Employee employee);

    public Optional<Employee> findEmployeeById(Integer id);

    public List<Employee> employeeList();

}
