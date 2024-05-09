package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo-items")
public class ToDoItemController {
    @Autowired
    private ToDoItemRepository toDoItemRepository;

    @PostMapping
    public ToDoItem createTodoItem(@RequestBody ToDoItem todoItem) {
        return toDoItemRepository.save(todoItem);
    }

    @GetMapping
    public List<ToDoItem> getAllTodoItems() {
        return toDoItemRepository.findAll();
    }

    @GetMapping("/{id}")
    public ToDoItem getTodoItemById(@PathVariable Long id) {
        return toDoItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TodoItem not found with id " + id));
    }

    @PutMapping("/{id}")
    public ToDoItem updateTodoItem(@PathVariable Long id, @RequestBody ToDoItem todoItemDetails) {
        ToDoItem todoItem = toDoItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TodoItem not found with id " + id));
        todoItem.setDescription(todoItemDetails.getDescription());
        todoItem.setCompleted(todoItemDetails.isCompleted());
        return toDoItemRepository.save(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        ToDoItem todoItem = toDoItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("TodoItem not found with id " + id));
        toDoItemRepository.delete(todoItem);
    }
}
