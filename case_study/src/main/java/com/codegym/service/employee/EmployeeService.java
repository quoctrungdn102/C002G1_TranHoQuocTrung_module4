package com.codegym.service.employee;

import com.codegym.model.employee.Division;
import com.codegym.model.employee.EducationDegree;
import com.codegym.model.employee.Employee;
import com.codegym.model.employee.Position;
import com.codegym.repository.employee.IDivisionRepository;
import com.codegym.repository.employee.IEducationRepository;
import com.codegym.repository.employee.IEmployeeRepository;
import com.codegym.repository.employee.IPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;
    @Autowired
    private IDivisionRepository iDivisionRepository;
    @Autowired
    private IEducationRepository iEducationRepository;
    @Autowired
    private IPositionRepository iPositionRepository;

    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAll(pageable);
    }

    public List<Position> findAllPosition() {
        return iPositionRepository.findAll();
    }

    public List<EducationDegree> findAllEducation() {
        return iEducationRepository.findAll();
    }

    public List<Division> findAllDivision() {
        return iDivisionRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return iEmployeeRepository.save(employee);
    }

    public Optional<Employee> findEmployeeById(Integer id) {
        return iEmployeeRepository.findById(id);
    }
}
