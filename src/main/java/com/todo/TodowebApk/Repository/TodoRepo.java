package com.todo.TodowebApk.Repository;

import com.todo.TodowebApk.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TodoRepo extends JpaRepository<Todo,Integer> {

    @Modifying
    @Query("update Todo t set t.status= :val where t.id= :id")
    public void updateStatus(@Param("id") Integer tid,@Param("val") String nval);
}
