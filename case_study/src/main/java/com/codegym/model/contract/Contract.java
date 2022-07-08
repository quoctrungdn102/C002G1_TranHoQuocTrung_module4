package com.codegym.model.contract;

import com.codegym.model.customer.Customer;
import com.codegym.model.employee.Employee;
import com.codegym.model.facility.Facility;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContract;
    private String starDay;
    private String endDay;
    private Double deposit;
    @ManyToOne(targetEntity = Employee.class)
    private Employee employee;
    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;
    @ManyToOne(targetEntity = Facility.class)
    private Facility facility;
    @OneToMany(mappedBy ="contract")
    @JsonBackReference("contract")
    private Set<ContractDetail> contractSets;

    public Contract() {

    }

    public Contract(Integer idContract, String starDay, String endDay, Double deposit, Employee employee, Customer customer, Facility facility, Set<ContractDetail> contractSets) {
        this.idContract = idContract;
        this.starDay = starDay;
        this.endDay = endDay;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.contractSets = contractSets;
    }

    public Integer getIdContract() {
        return idContract;
    }

    public void setIdContract(Integer idContract) {
        this.idContract = idContract;
    }

    public String getStarDay() {
        return starDay;
    }

    public void setStarDay(String starDay) {
        this.starDay = starDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }


    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Set<ContractDetail> getContractSets() {
        return contractSets;
    }

    public void setContractSets(Set<ContractDetail> contractSets) {
        this.contractSets = contractSets;
    }
}
