package com.codegym.ss8.repository;

import com.codegym.ss8.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserRepository extends JpaRepository<User, Integer> {
}
