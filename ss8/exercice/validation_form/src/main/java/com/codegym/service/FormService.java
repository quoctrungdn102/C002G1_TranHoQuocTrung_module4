package com.codegym.service;

import com.codegym.model.Form;
import com.codegym.repository.IFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormService implements IFormService {
    @Autowired
    IFormRepository iFormRepository;

    public List<Form> findAll() {
        return iFormRepository.findAll();
    }

    public void create(Form form) {
        iFormRepository.save(form);
    }
}
