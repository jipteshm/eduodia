package com.iodia.eduodia.service;

import java.util.List;

import com.iodia.eduodia.model.User;

public interface UserService
{

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    boolean isUserExist(User user);

}
