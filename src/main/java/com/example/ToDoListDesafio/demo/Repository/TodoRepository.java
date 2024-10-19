package com.example.ToDoListDesafio.demo.Repository;

import com.example.ToDoListDesafio.demo.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
