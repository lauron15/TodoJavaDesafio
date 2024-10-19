package com.example.ToDoListDesafio.demo.Service;

import com.example.ToDoListDesafio.demo.Model.Todo;
import com.example.ToDoListDesafio.demo.Repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> list() {
        return repository.findAll();
    }

    public Optional<Todo> listId(Long id) {
        return repository.findById(id);
    }

    public List<Todo> Create(Todo todo) {
        repository.save(todo);
        return list();
    }

    public List<Todo> uptade(Todo todo) {
        repository.save(todo);

        return list();
    }

    public List<Todo> Delete(Long id) {
        repository.deleteById(id);
        return list();
    }


}
