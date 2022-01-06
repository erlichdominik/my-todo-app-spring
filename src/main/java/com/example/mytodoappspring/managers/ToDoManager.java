package com.example.mytodoappspring.managers;

import com.example.mytodoappspring.models.ToDoItem;
import com.example.mytodoappspring.repositories.ToDoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ToDoManager {
    private ToDoItemRepository toDoItemRepository;

    @Autowired
    public ToDoManager(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    //CRUD methods that will be exposed to our controller
    public Optional<ToDoItem> findById(Long id) {
        return this.toDoItemRepository.findById(id);
    }

   public Iterable<ToDoItem> findAll() {
        return this.toDoItemRepository.findAll();
   }

   public ToDoItem save(ToDoItem toDoItem) {
        return this.toDoItemRepository.save(toDoItem);
   }

  public void deleteById(Long id) {
        this.toDoItemRepository.deleteById(id);
  }

}
