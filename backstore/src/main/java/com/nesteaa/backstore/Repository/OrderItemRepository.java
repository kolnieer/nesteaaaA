package com.nesteaa.backstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nesteaa.backstore.Model.OrderItem;


public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
