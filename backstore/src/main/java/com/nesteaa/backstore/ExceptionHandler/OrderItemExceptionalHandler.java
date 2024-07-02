package com.nesteaa.backstore.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nesteaa.backstore.NotFoundException.OrderItemNotFoundException;

@RestControllerAdvice
public class OrderItemExceptionalHandler {

    @ExceptionHandler(OrderItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String UserExceptionalHandle(OrderItemNotFoundException e){
        return e.getMessage();
    }

}
