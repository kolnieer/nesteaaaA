
package com.nesteaa.backstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nesteaa.backstore.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository <Order, Long> {



}

