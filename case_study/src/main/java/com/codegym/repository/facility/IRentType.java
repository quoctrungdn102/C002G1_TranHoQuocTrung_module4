package com.codegym.repository.facility;

import com.codegym.model.facility.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IRentType extends JpaRepository<RentType,Integer> {
}
