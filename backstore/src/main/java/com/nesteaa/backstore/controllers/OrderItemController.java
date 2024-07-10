package com.nesteaa.backstore.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nesteaa.backstore.Model.OrderItem;
import com.nesteaa.backstore.NotFoundException.OrderItemNotFoundException;
import com.nesteaa.backstore.Repository.OrderItemRepository;

@RestController
public class OrderItemController {
    OrderItemRepository repo;

    public OrderItemController(OrderItemRepository repo){
        this.repo = repo;
    }



    @GetMapping("/OrderItem")
    public List<OrderItem> getOrderItems(){
        return repo.findAll();
    }

    @GetMapping("/Order/{id}")
    public OrderItem getOrderItemid (@PathVariable Long id){
        return repo.findById(id)
        .orElseThrow(() -> new OrderItemNotFoundException(id));
    }

    @PostMapping("/OrderItem/new")
    public String addOrderItem(@RequestBody OrderItem newOrderItem){
        repo.save(newOrderItem);
        return "A new Order Item is Recorded";
    }

    @DeleteMapping("/OrderItem/Delete/{id}")
    public String deleteOrderItem(@PathVariable Long id){
        repo.deleteById(id);
        return "An Order Item is Deleted";
    }

}