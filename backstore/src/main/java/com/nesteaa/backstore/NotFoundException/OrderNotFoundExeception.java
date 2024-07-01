package com.nesteaa.backstore.NotFoundException;

public class OrderNotFoundExeception  extends RuntimeException {
    public OrderNotFoundExeception(Long id){
        super("Could not found  with" + id);
    }



}
