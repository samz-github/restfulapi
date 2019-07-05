package com.sam.service.impl;

import com.sam.dao.UserDao;
import com.sam.model.User;
import com.sam.service.UserService;
import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        List<User> list = userDao.findAll();
        return list;
    }

    @Override
    public void delete(int id) {
        userDao.deleteById(id);
    }

    @Override
    public User findOne(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public User findById(int id) {
        Optional<User> optionalUser = Optional.ofNullable(userDao.findById(id));
        return optionalUser.isPresent() ? optionalUser.get() : null;
    }

    @Override
    public User update(User user) {
        User newUser = findById(user.getId());
        if(newUser != null) {
            BeanUtils.copyProperties(user, newUser, "password");
            userDao.update(newUser);
        }
        return newUser;
    }

    @Override
    public User save(User user) {
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setPassword(user.getPassword());
        newUser.setAge(user.getAge());
        newUser.setSalary(user.getSalary());
        return userDao.update(newUser);
    }
}