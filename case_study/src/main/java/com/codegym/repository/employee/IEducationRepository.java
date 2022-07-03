package com.codegym.repository.employee;

import com.codegym.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IEducationRepository extends JpaRepository<EducationDegree,Integer> {
}
