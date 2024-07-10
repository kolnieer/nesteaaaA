package com.nesteaa.backstore.NotFoundException;

public class OrderNotFoundException  extends RuntimeException {
    public OrderNotFoundException(Long id){
        super("Could not found  with" + id);
    }



}
