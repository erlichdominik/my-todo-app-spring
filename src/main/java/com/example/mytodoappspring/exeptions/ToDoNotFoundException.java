package com.example.mytodoappspring.exeptions;

public class ToDoNotFoundException extends RuntimeException {
    public ToDoNotFoundException(Long id) {
        super("Could not found todo with id " + id);
    }
}
