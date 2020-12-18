package com.demo.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Admin;
import com.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	private String url="http://localhost:9300/admin/";
	private String urlAdmins="http://localhost:9300/admins/";
	
	private RestTemplate restTemplate=new RestTemplate();
	@Override
	public Admin addAdmin(Admin admin) {
		return restTemplate.postForObject(url,admin,Admin.class);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		restTemplate.put(url, admin);
		return admin;
	}

	@Override
	public List<Admin> getAllAdmins() {
		ResponseEntity<List<Admin>> response=restTemplate.exchange(urlAdmins, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Admin>>() {
		});
		return response.getBody();
	}

}
