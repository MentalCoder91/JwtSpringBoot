package com.jwt.serviceimpl;

import com.jwt.Repository.UserRepository;
import com.jwt.model.User;
import com.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl  implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
      return  userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUsersById(String id) {


        Optional<User> optionalUser = userRepository.findById(Long.parseLong(id));
        if(!optionalUser.isPresent()){
            System.out.println("User not present");
        }

        return optionalUser.get();

    }

    @Override
    public User updateUser(Long id, User user) {
        return  userRepository.save(user);
    }

    @Override
    public User deleteUser(Long id) {


        Optional<User> optionalUser = userRepository.findById(id);
        if(!optionalUser.isPresent()){
            System.out.println("User not present");
        }

        User user = optionalUser.get();
        userRepository.delete(user);
        return user;
    }

    @Override
    public User findByUsername(String username) {

        return userRepository.findByUsername(username);
    }




}
