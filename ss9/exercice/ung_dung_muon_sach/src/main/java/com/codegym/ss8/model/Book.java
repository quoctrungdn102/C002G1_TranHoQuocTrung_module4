package com.codegym.ss8.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook;
    private String nameBook;
    private Integer amount;
    @OneToMany(mappedBy = "book")
    private Set<User> userSet;

    public Book() {
    }

    public Book(Integer idBook, String nameBook, Integer amount, Set<User> userSet) {
        this.idBook = idBook;
        this.nameBook = nameBook;
        this.amount = amount;
        this.userSet = userSet;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}

