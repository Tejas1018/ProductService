package com.service.productservice.controllerAdvices;

import com.service.productservice.Exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class globalHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> productNotFoundException(ProductNotFoundException exception){
        //return new ResponseEntity<>("Product not found with given ID",HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ArithmeticException.class)
    public void ArthemeticException(){

    }
    //If any execption is not handling create a parent exception to handle all the exceptions
    @ExceptionHandler(Exception.class)
    public void exceptionHandling(){

    }
}
