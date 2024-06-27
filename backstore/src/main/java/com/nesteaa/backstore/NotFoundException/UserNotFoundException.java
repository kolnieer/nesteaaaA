package com.nesteaa.backstore.NotFoundException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(long id){
        super("Could not found product with" + id);
    }

}
