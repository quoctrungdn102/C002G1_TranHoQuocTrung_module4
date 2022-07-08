package com.codegym.model.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContractDetail;
    @ManyToOne(targetEntity = Contract.class)
    private Contract contract;
    @ManyToOne(targetEntity = AttachFacility.class)
    private AttachFacility attachFacility;
    private Integer quantity ;

    public ContractDetail() {
    }

    public ContractDetail(Integer idContractDetail, Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.idContractDetail = idContractDetail;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public Integer getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(Integer idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
