package com.codegym.quan_ly_san_pham.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class NhaXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategory;

    private String nameCategory;
    private String maNhaXe;
    @OneToMany(mappedBy = "nhaXe")
    @JsonBackReference("nhaXe")
    private Set<VeXe> veXeSet;

    public NhaXe() {
    }

    public NhaXe(Integer idCategory, String nameCategory, String maNhaXe, Set<VeXe> veXeSet) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.maNhaXe = maNhaXe;
        this.veXeSet = veXeSet;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getMaNhaXe() {
        return maNhaXe;
    }

    public void setMaNhaXe(String maNhaXe) {
        this.maNhaXe = maNhaXe;
    }

    public Set<VeXe> getVeXeSet() {
        return veXeSet;
    }

    public void setVeXeSet(Set<VeXe> veXeSet) {
        this.veXeSet = veXeSet;
    }
}
