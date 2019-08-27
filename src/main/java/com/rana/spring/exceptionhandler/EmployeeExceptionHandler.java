package com.rana.spring.exceptionhandler;

import com.rana.spring.exception.NotAMajorException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeExceptionHandler {

    @ExceptionHandler
    public String ageShouldBeGreaterThanEighteen(NotAMajorException exception){
        return exception.getMessage();
    }
}
