package com.codegym.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Song implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSong;
    @NotBlank(message = "tên không dược để trống  ")
    @Pattern(regexp = "^\\w+$", message = "tên không được chứa ký tự đặc biệt")
    private String nameSong;
    @NotBlank(message = "tên không dược để trống  ")
    @Pattern(regexp = "^\\w+$", message = "tên không được chứa ký tự đặc biệt")
    @Size(max = 30, message = "tên không quá 30 ký tự")
    private String singer;
    @NotBlank(message = "tên không dược để trống  ")
    @Pattern(regexp = "^(\\w|(,))+$", message = "tên không được chứa ký tự đặc biệt ngoại trừ ','")
    @Size(max = 30, message = "tên không quá 30 ký tự")
    private String category;

    public Song() {
    }

    public Song(Integer idSong, String nameSong, String singer, String category) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.singer = singer;
        this.category = category;
    }

    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Song song = (Song) target;
        if (!song.nameSong.matches("^\\w{0,15}$")) {
            errors.rejectValue("nameSong", "nameSong.validate");
        }

    }
}
