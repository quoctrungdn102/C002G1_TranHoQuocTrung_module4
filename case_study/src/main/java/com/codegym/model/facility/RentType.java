package com.codegym.model.facility;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRentType;
    private String nameRentType;
    @OneToMany(mappedBy = "rentType")
    @JsonIgnore
    private Set<Facility> facilitySet;

    public RentType() {
    }


    public RentType(Integer idRentType, String nameRentType, Set<Facility> facilitySet) {
        this.idRentType = idRentType;
        this.nameRentType = nameRentType;
        this.facilitySet = facilitySet;
    }

    public Set<Facility> getFacilitySet() {
        return facilitySet;
    }

    public void setFacilitySet(Set<Facility> facilitySet) {
        this.facilitySet = facilitySet;
    }

    public Integer getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(Integer idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }
}
