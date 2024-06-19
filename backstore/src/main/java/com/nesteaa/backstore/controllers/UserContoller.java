package com.nesteaa.backstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nesteaa.backstore.Model.UserModel;


@RestController
public class UserContoller {

    @GetMapping("/User")
    public UserModel getUser(){
        return new UserModel(1, "jeven 11", "jeven.11@email.com","jeven11");
    }  
}
