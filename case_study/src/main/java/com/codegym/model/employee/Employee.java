package com.codegym.model.employee;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmployee;
    private String nameEmployee;
    private String birthdayEmployee;
    private String idCardEmployee;
    private String salaryEmployee;
    private String phoneEmployee;
    private String emailEmployee;
    private String addressEmployee;
    @ManyToOne(targetEntity = Position.class)
    private Position position;
    @ManyToOne(targetEntity = EducationDegree.class)
    private EducationDegree educationDegree;
    @ManyToOne(targetEntity = Division.class)
    private Division division;
}
