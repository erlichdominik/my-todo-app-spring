package com.example.mytodoappspring.advices;

import com.example.mytodoappspring.exeptions.ToDoNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ToDoNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(ToDoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String toDoNotFoundHandler(ToDoNotFoundException ex) {
        return ex.getMessage();
    }
}
