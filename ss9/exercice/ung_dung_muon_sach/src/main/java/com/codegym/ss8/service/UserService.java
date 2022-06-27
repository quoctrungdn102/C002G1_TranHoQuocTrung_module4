package com.codegym.ss8.service;

import com.codegym.ss8.model.User;
import com.codegym.ss8.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;

    public void saveUser(User user) {
        iUserRepository.save(user);
    }

    public List<User> userList() {
        return iUserRepository.findAll();
    }

    public void remove(User user) {
        iUserRepository.delete(user);
    }
}
