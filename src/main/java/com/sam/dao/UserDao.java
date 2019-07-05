package com.sam.dao;

import com.sam.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> findAll();
    void deleteById(int id);

    User findByUsername(String username);

    User findById(int id);

    User update(User user);
}