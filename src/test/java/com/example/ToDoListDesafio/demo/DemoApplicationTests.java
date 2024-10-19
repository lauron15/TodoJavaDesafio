package com.example.ToDoListDesafio.demo;

import com.example.ToDoListDesafio.demo.Model.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

    @Autowired
    private WebTestClient webTestClient;

    /*@Test
    void testCreateTodoSucess() {
        Todo todo = new Todo("todo 1", "desc todo 1", false, 1);

        webTestClient
                .post()
                .uri("/todos")
                .bodyValue(todo)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$.nome").isEqualTo(todo.getNome())
                .jsonPath("$.descricao").isEqualTo(todo.getDescricao())
                .jsonPath("$.realizado").isEqualTo(todo.isRealizado())
                .jsonPath("$.prioridade").isEqualTo(todo.getPrioridade());
    }

    @Test
    void testCreateTodoFailure() {
        Todo todo = new Todo("", "", false, 0);

        webTestClient
                .post()
                .uri("/todos")
                .bodyValue(todo)
                .exchange()
                .expectStatus().isBadRequest();
    } */
}
