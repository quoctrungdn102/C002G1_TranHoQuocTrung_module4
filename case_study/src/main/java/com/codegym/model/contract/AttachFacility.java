package com.codegym.model.contract;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AttachFacility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAttachFacility;
    private String nameAttachFacility;
    private Double costAttachFacility;
    private String uintAttachFacility;
    private String statusAttachFacility;
    @OneToMany(mappedBy = "attachFacility")
    @JsonBackReference("attachFacility")
    private Set<ContractDetail> contractDetailSet;

    public AttachFacility() {
    }

    public AttachFacility(Integer idAttachFacility, String nameAttachFacility, Double costAttachFacility, String uintAttachFacility, String statusAttachFacility, Set<ContractDetail> contractDetailSet) {
        this.idAttachFacility = idAttachFacility;
        this.nameAttachFacility = nameAttachFacility;
        this.costAttachFacility = costAttachFacility;
        this.uintAttachFacility = uintAttachFacility;
        this.statusAttachFacility = statusAttachFacility;
        this.contractDetailSet = contractDetailSet;
    }

    public Integer getIdAttachFacility() {
        return idAttachFacility;
    }

    public void setIdAttachFacility(Integer idAttachFacility) {
        this.idAttachFacility = idAttachFacility;
    }

    public String getNameAttachFacility() {
        return nameAttachFacility;
    }

    public void setNameAttachFacility(String nameAttachFacility) {
        this.nameAttachFacility = nameAttachFacility;
    }

    public Double getCostAttachFacility() {
        return costAttachFacility;
    }

    public void setCostAttachFacility(Double costAttachFacility) {
        this.costAttachFacility = costAttachFacility;
    }

    public String getUintAttachFacility() {
        return uintAttachFacility;
    }

    public void setUintAttachFacility(String uintAttachFacility) {
        this.uintAttachFacility = uintAttachFacility;
    }

    public String getStatusAttachFacility() {
        return statusAttachFacility;
    }

    public void setStatusAttachFacility(String statusAttachFacility) {
        this.statusAttachFacility = statusAttachFacility;
    }

    public Set<ContractDetail> getContractDetailSet() {
        return contractDetailSet;
    }

    public void setContractDetailSet(Set<ContractDetail> contractDetailSet) {
        this.contractDetailSet = contractDetailSet;
    }
}
