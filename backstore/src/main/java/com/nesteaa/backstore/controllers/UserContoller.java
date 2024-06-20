package com.nesteaa.backstore.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nesteaa.backstore.Model.UserModel;


@RestController
public class UserContoller {

    @GetMapping("/User")
    public UserModel getUser(){
        return new UserModel(1, "jeven 11", "jeven.11@email.com","jeven11");
    }
    
    //http://localhost:8080/users
    @GetMapping("/users")
    public List<UserModel> getUsers(){
        List<UserModel> users = new ArrayList<>();
        users.add(new UserModel(1,"mario", "mario@gmail.com", "mario"));
        users.add(new UserModel(2,"juan", "juan@gmail.com", "juan"));
        users.add(new UserModel(3,"maria", "maria@gmail.com", "maria"));
        return users;

     }
     //http://localhost:8080/user/anne
     @GetMapping("/user/{name}")
     public UserModel getuserFromName(@PathVariable("name")String name){
        return new UserModel(1, "anne", "anne@gmail.com", "meow");
     }
}

