package com.demo.service.impl;

import java.util.List;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.demo.model.User;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private String url="http://localhost:9300/user/";
	private String urlUsers="http://localhost:9300/users/";
	
	private RestTemplate restTemplate=new RestTemplate();
	@Override
	public User addUser(User user) {
		return restTemplate.postForObject(url, user, User.class);
	}

	@Override
	public User updateUser(User user) {
		restTemplate.put(url, user);
		return user;
	}

	@Override
	public User getUserById(int id) {
		ResponseEntity<User> response=restTemplate.exchange(url+id, HttpMethod.GET,null,User.class);
		return response.getBody();
	}

	@Override
	public List<User> getAllUser() {
		ResponseEntity<List<User>> response=restTemplate.exchange(urlUsers, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<User>>() {
		});
		return response.getBody();
	}

	

}
