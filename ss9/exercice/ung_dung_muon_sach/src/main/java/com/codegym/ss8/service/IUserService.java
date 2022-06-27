package com.codegym.ss8.service;

import com.codegym.ss8.model.User;

import java.util.List;

public interface IUserService {
    public void saveUser(User user);

    public List<User> userList();

    public void remove(User user);


}
