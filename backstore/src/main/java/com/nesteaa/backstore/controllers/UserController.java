package com.nesteaa.backstore.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nesteaa.backstore.Model.User;
import com.nesteaa.backstore.NotFoundException.UserNotFoundException;
import com.nesteaa.backstore.Repository.UserRepository;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class UserController {

    UserRepository repo;

    public UserController(UserRepository repo){
        this.repo = repo;
    }
    
    
    @GetMapping("/User")
    public List<User> getUsers(){
        return repo.findAll();
    }

    //http://127.0.0.1:8080/product/2
    @GetMapping("/User/{id}")
    public User getUser(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new UserNotFoundException(id));
    }


    //http:127.0.0.1:8080/product/new
    @PostMapping("/User/new")
    public String addUser(@RequestBody User newUser){
        repo.save(newUser);
        return "A new user is added. Yey";
    }
    
    //http://127.0.0.1:8080/product/edit/1
    @PutMapping("/User/edit/{id}")
    public User updateUser(@PathVariable long id,@RequestBody User newUser){
        return repo.findById(id)
        .map(user ->{
            user.setUserName(newUser.getUserName());
            user.setAge(newUser.getage());
            user.setEmail(newUser.getEmail());
            return repo.save(user);
        }).orElseGet(()->{
            return repo.save(newUser);
        });
    }
    
    //http://127.0.0.1:8080/product/delete/1
    @DeleteMapping("/User/delete/{id}")
    public String deleteUser(@PathVariable long id){
        repo.deleteById(id);
        return "A user is deleted!";
    }
}
