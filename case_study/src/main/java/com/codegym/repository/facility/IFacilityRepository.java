package com.codegym.repository.facility;

import com.codegym.model.facility.Facility;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
}
