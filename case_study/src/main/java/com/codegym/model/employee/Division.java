package com.codegym.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDivision;
    private String nameDivision;
@OneToMany(mappedBy = "division")
@JsonBackReference("division")
private Set<Employee> employeeSet;
    public Division() {
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public Division(Integer idDivision, String nameDivision, Set<Employee> employeeSet) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
        this.employeeSet = employeeSet;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }
}



