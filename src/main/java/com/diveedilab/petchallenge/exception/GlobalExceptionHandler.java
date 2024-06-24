package com.diveedilab.petchallenge.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Timestamp;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ExceptionResourceNotFound.class)
   public ResponseEntity<ExceptionObj> handleExceptionResourceNotFound(Exception ex, HttpServletRequest request) {
        ExceptionObj exceptionObj = new ExceptionObj();
        exceptionObj.setStatusCode(HttpStatus.NOT_FOUND.value());
        exceptionObj.setMessage(ex.getMessage());
        exceptionObj.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return new ResponseEntity<>(exceptionObj,HttpStatus.NOT_FOUND);
   }
}
