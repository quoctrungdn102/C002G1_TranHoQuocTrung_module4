package com.codegym.repository;

import com.codegym.model.Application;

import java.util.List;

public interface IApplicationRepository {
    public List<Application> findAll();

    public void creatSong(Application application);

    public void editSong(Application application);

    public Application findById(int id);

    public void delete(Application application);


}
