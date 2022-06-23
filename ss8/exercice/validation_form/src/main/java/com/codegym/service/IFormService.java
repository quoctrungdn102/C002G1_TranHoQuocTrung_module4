package com.codegym.service;

import com.codegym.model.Form;

import java.util.List;

public interface IFormService {
    public List<Form> findAll();

    public void create(Form form);

}
