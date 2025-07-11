package com.ashwanicoding.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("username")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping("todos-list")
    public String getTodosList(ModelMap model){
        List<Todo> todos = todoService.getTodos();
        model.addAttribute("todos", todos);
        return "list-todos";
    }

}
