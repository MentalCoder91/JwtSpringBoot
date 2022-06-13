package com.jwt.controller;


import com.jwt.model.User;
import com.jwt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {


    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);



    @Autowired
    private UserService userService;


    @RequestMapping(value = "/welcomeAll",method = RequestMethod.GET)
    public String UserWelcome(){
        LOGGER.info("Inside the welcomeAll of User Controller");
        return "Welcome to the users";
    }


    @RequestMapping(value = "/Users",method = RequestMethod.GET)
    public List<User> getAllUsers(){
        LOGGER.info("Inside the getAllUsers of User Controller");
        return userService.getUsers();

    }


    @RequestMapping(value = "/Users",method = RequestMethod.POST)
    public User saveUser(@RequestBody User user){

        LOGGER.info("Inside the saveUser of User Controller");
        LOGGER.info(String.valueOf(user));


        return userService.saveUser(user);

    }

    @RequestMapping(value = "/Users/{id}",method = RequestMethod.PUT)
    public User updateUser(@PathVariable("id") Long id,@RequestBody User user){
        LOGGER.info("Inside the updateUser of User Controller");
        return  userService.updateUser(id, user);
    }

    @DeleteMapping("/Users/{id}")
    public User deleteUser(@PathVariable("id") Long id){
        LOGGER.info("Inside the deleteUser of User Controller");
        return userService.deleteUser(id);

    }














}
