package com.nesteaa.backstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nesteaa.backstore.Model.Order;
import com.nesteaa.backstore.NotFoundException.OrderNotFoundException;
import com.nesteaa.backstore.Repository.OrderRepository;

@RestController
public class OrderController {

    @Autowired
    OrderRepository repo;

    @GetMapping("/orders")
    public List<Order> getOrders(){
    return repo.findAll();
    }

    //htpp:127.0.0.1:8080/order/1
    @GetMapping("/order/{id}")
    public Order getOrder(@PathVariable Long id){
    return repo.findById(id)
    .orElseThrow(()-> new OrderNotFoundException(id));
    }

    //http://127.0.0.1:8080/order/new
    @PostMapping("/order/new")
    public String addOrder(@RequestBody Order newOrder){
        repo.save(newOrder);
        return "A new order has been added";
    }

    //http://127.0.0.1:8080/order/delete/{id}
    @DeleteMapping("/order/delete/{id}")
    public String deleteOrder(@PathVariable Long id){
        repo.deleteById(id);
        return "A order is deleted";
    }

}
