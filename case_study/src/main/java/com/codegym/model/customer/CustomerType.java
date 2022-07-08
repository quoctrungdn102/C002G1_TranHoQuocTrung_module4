package com.codegym.model.customer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCustomerType;
    private String nameCustomerType;
    @OneToMany(mappedBy = "customerType")
    @JsonBackReference("customerType")
    private Set<Customer> customers;

    public CustomerType() {
    }

    public CustomerType(Integer idCustomerType, String nameCustomerType, Set<Customer> customers) {
        this.idCustomerType = idCustomerType;
        this.nameCustomerType = nameCustomerType;
        this.customers = customers;
    }

    public Integer getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(Integer idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
}
