package com.todo.TodowebApk.Controller;

import com.todo.TodowebApk.Entity.Todo;
import com.todo.TodowebApk.Repository.TodoRepo;
import com.todo.TodowebApk.Service.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    TodoRepo t;
    @Autowired
    services s;

    @GetMapping("/todos")
    public List<Todo> findAll() {
        System.out.println("Find operation perform successfully--");
        return t.findAll();
    }

    @PostMapping("/add")
    public String createTodo(@RequestBody Todo ts) {
        t.save(ts);
        return "Added Successfully";
    }

    @GetMapping("/todos/{id}")
    public Todo getOne(@PathVariable Integer id) {
        return s.getOne(id);
    }
    @PutMapping("/todos/{id}/{t}")
    public String update(@PathVariable Integer id,@PathVariable String  t)
    {
        s.getUpdate(id,t);
        return "Updated Successfully";

    }
    @DeleteMapping("/todo/delete/{id}")
    public String deleteTodo(@PathVariable Integer id)
    {
        t.deleteById(id);
        return "Deleted Successfully";
    }
}