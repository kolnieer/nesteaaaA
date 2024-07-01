package com.nesteaa.backstore.ExceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nesteaa.backstore.NotFoundException.OrderNotFoundExeception;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class OrderExceptionHandler {

    @ExceptionHandler(OrderNotFoundExeception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String UserExceptionalHandle(OrderNotFoundExeception e){
        return e.getMessage();
    }
}

