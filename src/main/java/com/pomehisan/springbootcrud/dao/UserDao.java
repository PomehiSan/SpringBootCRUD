package com.pomehisan.springbootcrud.dao;

import com.pomehisan.springbootcrud.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    User getUser(Long id);

    List<User> getUsers();

    void updateUser(User user);

    void deleteUser(Long id);
}
