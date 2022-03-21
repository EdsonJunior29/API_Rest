package com.ApiRest.api.repository;

import com.ApiRest.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void saveUser(User user){
        if(user.getId() == null){
            System.out.println("Save - repository layer user ");
        } else {
            System.out.println("Update - repository layer user");
            System.out.println(user);
        }
    }

    public void delete(Integer id){
        System.out.println(String.format("Delete /id - We received the id: %d to delete a user" ,id));
        System.out.println(id);
    }

    public List<User> findAll(){
        System.out.println("Listing system users");
        List<User> users = new ArrayList<>();
        users.add(new User("edson" , "123456"));
        users.add(new User("robson" , "123456"));
        return users;
    }

    public User findById(Integer id){
        return new User("edson" , "123456");
    }

    public User findByUserName(String userName){
        System.out.println(String.format("Find -User Name %s" , userName));
        return new User(userName , "123456");
    }
}
