package com.codegym.model.facility;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FacilityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFacilityType;
    private String nameFacilityType;
    @OneToMany(mappedBy = "facilityType")
    @JsonIgnore
    private Set<Facility> facilityset;

    public FacilityType() {
    }

    public FacilityType(Integer idFacilityType, String nameFacilityType, Set<Facility> facilityset) {
        this.idFacilityType = idFacilityType;
        this.nameFacilityType = nameFacilityType;
        this.facilityset = facilityset;
    }

    public Integer getIdFacilityType() {
        return idFacilityType;
    }

    public void setIdFacilityType(Integer idFacilityType) {
        this.idFacilityType = idFacilityType;
    }

    public String getNameFacilityType() {
        return nameFacilityType;
    }

    public void setNameFacilityType(String nameFacilityType) {
        this.nameFacilityType = nameFacilityType;
    }

    public Set<Facility> getFacilityset() {
        return facilityset;
    }

    public void setFacilityset(Set<Facility> facilityset) {
        this.facilityset = facilityset;
    }
}
