package com.codegym.service;

import com.codegym.model.Application;
import com.codegym.repository.IApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService implements IApplicationService {
    @Autowired
    IApplicationRepository iApplicationRepository;

    @Override
    public List<Application> findAll() {
        return iApplicationRepository.findAll();
    }

    @Override
    public void creatSong(Application application) {
        iApplicationRepository.creatSong(application);
    }

    @Override
    public void editSong(Application application) {
        iApplicationRepository.editSong(application);
    }

    @Override
    public Application findById(int id) {
        return iApplicationRepository.findById(id);
    }

    @Override
    public void delete(Application application) {
        iApplicationRepository.delete(application);
    }
}
