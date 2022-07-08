package com.codegym.model.facility;

import com.codegym.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFacility;
    private String nameFacility;
    private Integer areaFacility;
    private Double costFacility;
    private Integer maxPeopleFacility;
    @ManyToOne(targetEntity = FacilityType.class)
    private FacilityType facilityType;
    @ManyToOne(targetEntity =RentType.class)
    private RentType rentType;
    private String standardRoom;
    private String descriptionOther;
    private String poolArea;
    private Integer numberOfFloors;
    private String facilityFree;
    @OneToMany(mappedBy = "facility")
    @JsonBackReference("facility")
    private Set<Contract> contractSet;

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public Facility(Integer idFacility, String nameFacility, Integer areaFacility, Double costFacility, Integer maxPeopleFacility, FacilityType facilityType, RentType rentType, String standardRoom, String descriptionOther, String poolArea, Integer numberOfFloors, String facilityFree, Set<Contract> contractSet) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.areaFacility = areaFacility;
        this.costFacility = costFacility;
        this.maxPeopleFacility = maxPeopleFacility;
        this.facilityType = facilityType;
        this.rentType = rentType;
        this.standardRoom = standardRoom;
        this.descriptionOther = descriptionOther;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.facilityFree = facilityFree;
        this.contractSet = contractSet;
    }

    public Facility() {
    }

    public Facility(Integer idFacility, String nameFacility, Integer areaFacility, Double costFacility, Integer maxPeopleFacility, FacilityType facilityType, RentType rentType, String standardRoom, String descriptionOther, String poolArea, Integer numberOfFloors, String facilityFree) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.areaFacility = areaFacility;
        this.costFacility = costFacility;
        this.maxPeopleFacility = maxPeopleFacility;
        this.facilityType = facilityType;
        this.rentType = rentType;
        this.standardRoom = standardRoom;
        this.descriptionOther = descriptionOther;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.facilityFree = facilityFree;
    }

    public Integer getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(Integer idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public Integer getAreaFacility() {
        return areaFacility;
    }

    public void setAreaFacility(Integer areaFacility) {
        this.areaFacility = areaFacility;
    }

    public Double getCostFacility() {
        return costFacility;
    }

    public void setCostFacility(Double costFacility) {
        this.costFacility = costFacility;
    }

    public Integer getMaxPeopleFacility() {
        return maxPeopleFacility;
    }

    public void setMaxPeopleFacility(Integer maxPeopleFacility) {
        this.maxPeopleFacility = maxPeopleFacility;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOther() {
        return descriptionOther;
    }

    public void setDescriptionOther(String descriptionOther) {
        this.descriptionOther = descriptionOther;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getFacilityFree() {
        return facilityFree;
    }

    public void setFacilityFree(String facilityFree) {
        this.facilityFree = facilityFree;
    }
}
