package com.nesteaa.backstore.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    private @Id
    @GeneratedValue long id;
    private String username;
    private int age;
    private String Email;

    User(){}

    public User(String username, int age, String Email) {
        this.username = username;
        this.age = age;
        this.Email = Email;
    }


    public void setUserName(String userName) {
        this.username = userName;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setEmail(String email) {
        this.Email = email;
    }


    public long getId() {
        return id;
    }


    public String getUserName() {
        return username;
    }


    public int getage() {
        return age;
    }


    public String getEmail() {
        return Email;
    }

    
    

}
