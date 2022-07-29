package com.codegym.quan_ly_san_pham.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class VeXe implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "tên không được để trống")
//    @Pattern(regexp = "^\\w*$", message = "tên không được chứa kí tự đặc biệt")
    private String diemDi;
    private String diemDen;
    @Pattern(regexp = "^[1-9]|[0-9]{2,}$", message = "lớn hơn không  ")
    private Double price;
    @NotBlank(message = "không được để trống ")
    private String ngayKhoiHanh;
    @NotBlank(message = "không được để trống")
    private String gioKhoiHanh;
    @ManyToOne(targetEntity = NhaXe.class )
    private NhaXe nhaXe;
    private Integer soLuong;


    public VeXe() {
    }

    public VeXe(Integer id, @NotBlank(message = "tên không được để trống") String diemDi, String diemDen, @Pattern(regexp = "^[1-9]|[0-9]{2,}$", message = "lớn hơn không  ") Double price, @NotBlank(message = "không được để trống ") String ngayKhoiHanh, @NotBlank(message = "không được để trống") String gioKhoiHanh, NhaXe nhaXe, Integer soLuong) {
        this.id = id;
        this.diemDi = diemDi;
        this.diemDen = diemDen;
        this.price = price;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.gioKhoiHanh = gioKhoiHanh;
        this.nhaXe = nhaXe;
        this.soLuong = soLuong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiemDi() {
        return diemDi;
    }

    public void setDiemDi(String diemDi) {
        this.diemDi = diemDi;
    }

    public String getDiemDen() {
        return diemDen;
    }

    public void setDiemDen(String diemDen) {
        this.diemDen = diemDen;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getGioKhoiHanh() {
        return gioKhoiHanh;
    }

    public void setGioKhoiHanh(String gioKhoiHanh) {
        this.gioKhoiHanh = gioKhoiHanh;
    }

    public NhaXe getNhaXe() {
        return nhaXe;
    }

    public void setNhaXe(NhaXe nhaXe) {
        this.nhaXe = nhaXe;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
