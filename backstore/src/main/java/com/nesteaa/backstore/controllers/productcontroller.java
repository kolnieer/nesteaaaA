package com.nesteaa.backstore.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nesteaa.backstore.Model.Product;
import com.nesteaa.backstore.NotFoundException.ProductNotFoundException;
import com.nesteaa.backstore.Repository.productrepository;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/v1/product")
public class productcontroller {

    productrepository  repo;

    public productcontroller(productrepository repo){
        this.repo = repo;
    }
    
    
    @GetMapping("/all")
    public List<Product> getProducts(){
        return repo.findAll();
    }

    //http://127.0.0.1:8080/product/2
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(()-> new ProductNotFoundException(id));
    }


    //http:127.0.0.1:8080/product/new
    @PostMapping("/new")
    public String addProduct(@RequestBody Product newProduct){
        repo.save(newProduct);
        return "A new product is added. Yey";
    }
    
    //http://127.0.0.1:8080/product/edit/1
    @PutMapping("/edit/{id}")
    public Product updateProduct(@PathVariable long id,@RequestBody Product newProduct){
        return repo.findById(id)
        .map(product ->{
            product.setProductName(newProduct.getProductName());
            product.setDescription(newProduct.getDescription());
            product.setPrice(newProduct.getPrice());
            return repo.save(product);
        }).orElseGet(()->{
            return repo.save(newProduct);
        });
    }
    
    //http://127.0.0.1:8080/product/delete/1
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable long id){
        repo.deleteById(id);
        return "A product is deleted!";
    }
}