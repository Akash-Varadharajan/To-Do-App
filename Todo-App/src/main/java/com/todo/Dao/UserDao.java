package com.todo.Dao;

import java.util.List;

import com.todo.Model.User;

public interface UserDao {

	int insert(User user);
	User fetchOne(String email);
	//List<User> fetchAll();
}
