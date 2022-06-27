package com.codegym.ss8.repository;

import com.codegym.ss8.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IBookRepository extends JpaRepository<Book, Integer> {

}
