package com.example.ToDoListDesafio.demo.Controller;

import com.example.ToDoListDesafio.demo.Model.Todo;
import com.example.ToDoListDesafio.demo.Service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/todos")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> list() {
        return todoService.list();
    }

    @GetMapping("/{id}")
    public Optional<Todo> listId(@PathVariable Long id) {
        return todoService.listId(id);
    }

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo) {
        return todoService.Create(todo);
    }

    @PutMapping
    public List<Todo> update(@RequestBody Todo todo) {
        return todoService.uptade(todo);

    }

    @DeleteMapping("{id}")
    public List<Todo>delete(@PathVariable Long id){
        return todoService.Delete(id);
    }


}
