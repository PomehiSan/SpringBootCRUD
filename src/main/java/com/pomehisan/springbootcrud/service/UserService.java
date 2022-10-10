package com.pomehisan.springbootcrud.service;

import com.pomehisan.springbootcrud.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    User getUser(Long id);

    List<User> getUsers();

    void updateUser(User user);

    void deleteUser(Long id);
}
