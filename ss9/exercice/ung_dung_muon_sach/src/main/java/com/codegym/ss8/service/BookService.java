package com.codegym.ss8.service;

import com.codegym.ss8.model.Book;
import com.codegym.ss8.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository iBookRepository;

    public List<Book> bookList() {
        return iBookRepository.findAll();
    }

    public Optional<Book> findById(Integer id) {
        return iBookRepository.findById(id);
    }

    public void save(Book book) {
        iBookRepository.save(book);
    }

}
