package com.example.mytodoappspring.controllers;

import com.example.mytodoappspring.exeptions.ToDoNotFoundException;
import com.example.mytodoappspring.models.ToDoItem;
import com.example.mytodoappspring.repositories.ToDoItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    private final ToDoItemRepository toDoItemRepository;

    ToDoController(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    @GetMapping
    List<ToDoItem> getAllToDos() {
        return toDoItemRepository.findAll();
    }

    @GetMapping("/{id}")
    ToDoItem getToDo(@PathVariable Long id) {
        return toDoItemRepository.findById(id)
                .orElseThrow(() -> new ToDoNotFoundException(id));
    }

    @PostMapping
    ToDoItem addToDo(@RequestBody ToDoItem toDoItem) {
        return toDoItemRepository.save(toDoItem);
    }

    @DeleteMapping("/{id}")
    void deleteToDo(@PathVariable Long id) {
        toDoItemRepository.deleteById(id);
    }

}
