package com.nesteaa.backstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nesteaa.backstore.Model.Product;

public interface productrepository extends JpaRepository <Product, Long>{

}
