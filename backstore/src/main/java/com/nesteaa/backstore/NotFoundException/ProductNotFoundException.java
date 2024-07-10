package com.nesteaa.backstore.NotFoundException;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(long id){
        super("Could not found product with" + id);
    }

}
