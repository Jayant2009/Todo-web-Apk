package com.todo.TodowebApk.Service;

import com.todo.TodowebApk.Entity.Todo;
import com.todo.TodowebApk.Repository.TodoRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class services {
    @Autowired
    TodoRepo tr;

    public Todo getOne(Integer id)
    {
        List<Todo> lis= tr.findAll();

        Todo t=null;
        for(Todo s:lis)
        {
            if(s.getId()==id)
            {
                t=s;
                break;
            }
        }
        return t;
    }

    @Transactional
    public void getUpdate(Integer id,String st)
    {
        List<Todo> lis= tr.findAll();

        Todo t=null;
        for(Todo s:lis)
        {
            if(s.getId()==id)
            {
                t=s;
                break;
            }
        }

        tr.updateStatus(t.getId(),st);

    }

}
