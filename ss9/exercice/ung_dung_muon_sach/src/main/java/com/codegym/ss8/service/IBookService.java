package com.codegym.ss8.service;

import com.codegym.ss8.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    public List<Book> bookList();

    public Optional<Book> findById(Integer id);

    public void save(Book book);


}
