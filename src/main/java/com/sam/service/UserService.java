package com.sam.service;

import com.sam.model.User;

import java.util.List;

public interface UserService {

    User save(User user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    User update(User user);
}