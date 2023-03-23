package com.todo.TodowebApk.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    @Column(name = "todoID")
    private int id;

    @Column(name = "todoTitle")
    private String title;

    @Column(name = "todoDesc")
    private String desc;
    private String status;

    public Todo() {
    }

    public Todo(int id, String title, String desc, String status) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
