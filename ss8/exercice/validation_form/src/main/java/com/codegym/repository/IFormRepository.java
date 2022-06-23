package com.codegym.repository;

import com.codegym.model.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IFormRepository extends JpaRepository<Form,String> {
}
