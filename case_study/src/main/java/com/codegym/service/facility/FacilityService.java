package com.codegym.service.facility;

import com.codegym.model.facility.Facility;
import com.codegym.model.facility.FacilityType;
import com.codegym.model.facility.RentType;
import com.codegym.repository.facility.IFacilityRepository;
import com.codegym.repository.facility.IFacilityType;
import com.codegym.repository.facility.IRentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;
    @Autowired
    private IFacilityType iFacilityType;
    @Autowired
    private IRentType iRentType;

    @Override
    public Page<Facility> findAll(Pageable pageable) {
        return iFacilityRepository.findAll(pageable);
    }

    @Override
    public void saveFacility(Facility facility) {
        iFacilityRepository.save(facility);
    }

    @Override
    public List<FacilityType> listFacilityType() {
        return iFacilityType.findAll();
    }

    @Override
    public List<RentType> listRentType() {
        return iRentType.findAll();
    }

    @Override
    public Facility findById(Integer id) {
        return iFacilityRepository.findById(id).get();
    }

    @Override
    public void deleteFacility(Facility facility) {
        iFacilityRepository.delete(facility);
    }
}
