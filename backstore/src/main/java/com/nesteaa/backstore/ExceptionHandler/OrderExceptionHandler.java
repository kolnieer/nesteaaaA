package com.nesteaa.backstore.ExceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nesteaa.backstore.NotFoundException.OrderNotFoundException;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class OrderExceptionHandler {

    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String UserExceptionalHandle(OrderNotFoundException e){
        return e.getMessage();
    }
}

