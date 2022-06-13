package com.jwt.service;

import com.jwt.model.User;

import java.util.List;

public interface UserService {


    User saveUser(User user);

    List<User> getUsers();

    User getUsersById(String id);

    User updateUser(Long id,User user);

    User deleteUser(Long id);

    User findByUsername(String username);


}
