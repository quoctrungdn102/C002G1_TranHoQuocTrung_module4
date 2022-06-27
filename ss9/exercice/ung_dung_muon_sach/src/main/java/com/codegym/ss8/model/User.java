package com.codegym.ss8.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    (strategy = GenerationType.IDENTITY)
    private Integer idUser;
    @ManyToOne(targetEntity = Book.class)
    private Book book;
    private Integer codeBook;

    public User() {
    }

    public User(Integer idUser, Book book, Integer codeBook) {
        this.idUser = idUser;
        this.book = book;
        this.codeBook = codeBook;
    }

    public User(Book book, Integer codeBook) {
        this.book = book;
        this.codeBook = codeBook;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Integer getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(Integer codeBook) {
        this.codeBook = codeBook;
    }
}
