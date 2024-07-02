package com.nesteaa.backstore.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderItem {
    private @Id
    @GeneratedValue Long OrderItemid;
    private Long orderid;
    private Long productid;
    private int quantity;
    private double price;

    OrderItem(){}
        public OrderItem( Long orderid, Long productid, int quantity, double price) {
            this.orderid = orderid;
            this.productid = productid;
            this.quantity = quantity;
            this.price = price;

        }
        public void setOrderid(Long orderid) {
            this.orderid = orderid;
        }

        public void setProductid(Long productid) {
            this.productid = productid;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Long getOrderItemid() {
            return OrderItemid;
        }

        public Long getOrderid() {
            return orderid;
        }

        public Long getProductid() {
            return productid;
        }

        public int getQuantity() {
            return quantity;
        }
        
        public double getPrice() {
            return price;
        }



    }

