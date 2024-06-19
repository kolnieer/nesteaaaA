package com.nesteaa.backstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleController {

    //http://localhost:8080/new-hello
    @GetMapping("/new-hello")
    public String helloworld(){
        return "hello world";
    }


}
