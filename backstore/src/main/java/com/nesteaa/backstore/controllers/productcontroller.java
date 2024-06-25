package com.nesteaa.backstore.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nesteaa.backstore.Model.Product;
import com.nesteaa.backstore.Repository.productrepository;

@RestController
public class productcontroller {

    productrepository  repo;

    public productcontroller(productrepository repo){
        this.repo = repo;
    }
    
    
    @GetMapping("/products")
    public List<Product> getProducts(){
        return repo.findAll();
    }

    // public Product geProduct(Long id){
    //     return repo.findby(id);
    // }


    //http:127.0.0.1:8080/product/new
    @PostMapping("/product/new")
    public String addProduct(@RequestBody Product newProduct){
        repo.save(newProduct);
        return "A new product is added. Yey";
    }
}
