package com.codegym.service.facility;

import com.codegym.model.facility.Facility;
import com.codegym.model.facility.FacilityType;
import com.codegym.model.facility.RentType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {
    Page<Facility> findAll(Pageable pageable);

    void saveFacility(Facility facility);

    List<FacilityType> listFacilityType();

    List<RentType> listRentType();

    Facility findById(Integer id);
    void deleteFacility(Facility facility);
}
