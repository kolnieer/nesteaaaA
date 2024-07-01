package com.nesteaa.backstore.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertbl")
public class Order {
    private @Id
    @GeneratedValue long id;
    private Long userId;
    private double totalamount;
    private String status;

    Order(){}

    public Order(Long userId, double totalamount, String status){
        this.userId = userId;
        this.totalamount = totalamount;
        this.status = status;
    }

    public void setuserId(Long userId){
        this.userId = userId;
    }
    
    public void settotalamount(double totalamount){
        this.totalamount = totalamount;
    }

    public void setstatus(String status){
        this.status = status;
    }

    public Long getId(){
        return id;
    }

    public Long getuserId() {
        return userId;
    }

    public double gettotalamount() {
        return totalamount;
    }

    public String getstatus() {
        return status;
    }

}
