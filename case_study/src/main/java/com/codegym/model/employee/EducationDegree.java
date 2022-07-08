package com.codegym.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEducation;
    private String nameEducation;
    @OneToMany(mappedBy = "educationDegree")
    @JsonBackReference("educationDegree")
    private Set<Employee> employees;

    public EducationDegree() {
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public EducationDegree(Integer idEducation, String nameEducation, Set<Employee> employees) {
        this.idEducation = idEducation;
        this.nameEducation = nameEducation;
    }

    public Integer getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(Integer idEducation) {
        this.idEducation = idEducation;
    }

    public String getNameEducation() {
        return nameEducation;
    }

    public void setNameEducation(String nameEducation) {
        this.nameEducation = nameEducation;
    }

}
