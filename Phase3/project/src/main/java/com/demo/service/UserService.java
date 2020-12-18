package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface UserService {

	public User addUser(User user);
	public User updateUser(User user);
	public User getUserById(int id);
	public List<User> getAllUser();
}
