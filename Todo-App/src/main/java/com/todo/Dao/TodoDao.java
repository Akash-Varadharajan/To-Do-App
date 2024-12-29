package com.todo.Dao;

import java.util.List;

import com.todo.Model.Todo;

public interface TodoDao {
	
	int insert(Todo todo);
	List<Todo> fetchAll();
}
