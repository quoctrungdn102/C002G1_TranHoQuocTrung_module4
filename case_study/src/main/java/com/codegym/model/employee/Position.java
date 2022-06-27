package com.codegym.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPosition;
    private String namePosition;
    @OneToMany(mappedBy = "position")
    private Set<Employee> employees;

    public Position() {
    }

    public Position(Integer idPosition, String namePosition, Set<Employee> positions) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
        this.employees = positions;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public Set<Employee> getPositions() {
        return employees;
    }

    public void setPositions(Set<Employee> positions) {
        this.employees = positions;
    }
}
