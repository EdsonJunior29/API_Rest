package com.ApiRest.api.controller;

import com.ApiRest.api.model.User;
import com.ApiRest.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
     private UserRepository userRepository;

    @GetMapping
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{userName}")
    public User findOne(@PathVariable("userName")String userName){
        return userRepository.findByUserName(userName);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id")Integer id){
        userRepository.delete(id);
    }

    @PostMapping
    public void createdUser(@RequestBody User user){
        userRepository.saveUser(user);
    }
}
