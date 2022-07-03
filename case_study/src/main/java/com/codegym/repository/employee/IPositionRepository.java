package com.codegym.repository.employee;

import com.codegym.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IPositionRepository extends JpaRepository<Position,Integer> {
}
