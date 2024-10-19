package com.example.ToDoListDesafio.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "realizado")
    private String realizado;

    @Column(name = "prioridade")
    private int prioridade;

    // Construtor padrão
    public Todo() {
    }

    // Construtor com parâmetros
    public Todo(String nome, String descricao, String realizado, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.realizado=realizado;
        this.prioridade = prioridade;
    }
}
