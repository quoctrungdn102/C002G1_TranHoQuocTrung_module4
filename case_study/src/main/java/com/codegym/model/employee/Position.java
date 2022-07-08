package com.codegym.model.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPosition;
    private String namePosition;
@OneToMany(mappedBy = "position")
@JsonBackReference("position")
private Set<Employee> positions;
    public Position() {
    }

    public Position(Integer idPosition, String namePosition, Set<Employee> positions) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
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

}
