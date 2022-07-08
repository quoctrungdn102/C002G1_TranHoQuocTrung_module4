package com.codegym.model.customer;

import com.codegym.model.contract.Contract;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCustomer;
    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;
    private String nameCustomer;
    @Column(columnDefinition = "date")
    private String birthdayCustomer;
    private Boolean genderCustomer ;
    private String idCardCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String addressCustomer;
    @OneToMany(mappedBy = "customer")
    @JsonBackReference("customer")
    private Set<Contract> contractSet;

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }

    public Customer(Integer idCustomer, CustomerType customerType, String nameCustomer, String birthdayCustomer, Boolean genderCustomer, String idCardCustomer, String phoneCustomer, String emailCustomer, String addressCustomer, Set<Contract> contractSet) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
        this.contractSet = contractSet;
    }

    public Customer() {
    }

    public Customer(Integer idCustomer,
                    CustomerType customerType,
                    String nameCustomer,
                    String birthdayCustomer,
                    Boolean genderCustomer,
                    String idCardCustomer,
                    String phoneCustomer,
                    String emailCustomer,
                    String addressCustomer) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.idCardCustomer = idCardCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addressCustomer = addressCustomer;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public Boolean getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(Boolean genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }
}
