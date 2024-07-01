package com.nesteaa.backstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nesteaa.backstore.Model.Order;


public interface OrderRepository extends JpaRepository <Order, Long> {



}
