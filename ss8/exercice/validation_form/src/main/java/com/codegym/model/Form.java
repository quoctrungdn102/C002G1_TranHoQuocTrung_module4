package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    @Size(min = 5, max = 45, message = "tên 5-45 ký tự")
    private String firstName;
    @Size(min = 5, max = 45, message = "tên 5-45 ký tự")
    private String lastName;
    @Pattern(regexp = "(0905)[0-9]{6}", message = "  (0905)-XXXXXX ")
    private String phone;
    @Column(columnDefinition = "Long")
    @Max(value = 18, message = "tuổi nhỏ hơn 18")
    @Min(value = 0, message = "tuổi lớn hơn 0")
    private Integer age;
    @Pattern(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}", message = "sai định dạng email ")
    private String email;

    public Form() {
    }

    public Form(Integer idUser, String firstName, String lastName, String phone, Integer age, String email) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
