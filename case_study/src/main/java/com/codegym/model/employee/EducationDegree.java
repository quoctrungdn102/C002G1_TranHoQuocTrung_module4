package com.codegym.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEducation;
    private String nameEducation;
    @OneToMany(mappedBy = "educationDegree")
    Set<Employee> employees;

    public EducationDegree() {
    }

    public EducationDegree(Integer idEducation, String nameEducation, Set<Employee> employees) {
        this.idEducation = idEducation;
        this.nameEducation = nameEducation;
        this.employees = employees;
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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
