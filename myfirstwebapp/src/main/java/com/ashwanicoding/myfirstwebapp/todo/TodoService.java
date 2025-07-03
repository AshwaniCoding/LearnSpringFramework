package com.ashwanicoding.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1,"ashwanicoding","Learn AWS", LocalDate.now().plusDays(10),false));
        todos.add(new Todo(2,"ashwanicoding","Learn DevOps", LocalDate.now().plusDays(20),false));
        todos.add(new Todo(3,"ashwanicoding","Learn Azure", LocalDate.now().plusDays(40),false));
    }

    public List<Todo> getTodos() {
        return todos;
    }
}
