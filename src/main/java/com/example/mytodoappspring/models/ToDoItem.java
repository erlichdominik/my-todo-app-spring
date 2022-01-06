package com.example.mytodoappspring.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ToDoItem {
    @Id
    @GeneratedValue
    private long id;

    private String value;

   protected ToDoItem() {}

   public ToDoItem(String value) {
       this.value = value;
   }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToDoItem)) return false;
        ToDoItem toDoItem = (ToDoItem) o;
        return id == toDoItem.id && getValue().equals(toDoItem.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, getValue());
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
