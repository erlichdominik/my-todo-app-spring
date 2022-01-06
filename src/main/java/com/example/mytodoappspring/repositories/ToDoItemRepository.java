package com.example.mytodoappspring.repositories;

import com.example.mytodoappspring.models.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ToDoItemRepository extends JpaRepository<ToDoItem, Long> {
}
