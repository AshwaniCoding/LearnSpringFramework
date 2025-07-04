package com.ashwanicoding.todo_app.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;

    static {

        todos.add(new Todo(++todoCount, "ashwanicoding", "Learn AWS Now", LocalDate.now().plusDays(5), false));
        todos.add(new Todo(++todoCount, "ashwanicoding", "Learn DevOps", LocalDate.now().plusDays(10), false));
        todos.add(new Todo(++todoCount, "mohancoding", "Learn Full Stack", LocalDate.now().plusDays(10), false));
        todos.add(new Todo(++todoCount, "ashwanicoding", "Learn Spring", LocalDate.now().plusDays(20), false));

    }

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equals(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(++todoCount, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
