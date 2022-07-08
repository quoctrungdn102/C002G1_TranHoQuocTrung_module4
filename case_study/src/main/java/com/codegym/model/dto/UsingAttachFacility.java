package com.codegym.model.dto;

import javax.persistence.Entity;

public class UsingAttachFacility {
    private String nameAttachFacility;
    private Long soLuong;

    public UsingAttachFacility(Long soLuong) {
        this.soLuong = soLuong;
    }

    public UsingAttachFacility(String nameAttachFacility, Long soLuong) {
        this.nameAttachFacility = nameAttachFacility;
        this.soLuong = soLuong;
    }

    public String getNameAttachFacility() {
        return nameAttachFacility;
    }

    public void setNameAttachFacility(String nameAttachFacility) {
        this.nameAttachFacility = nameAttachFacility;
    }

    public Long getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Long soLuong) {
        this.soLuong = soLuong;
    }
}
