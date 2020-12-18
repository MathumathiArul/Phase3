package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Admin;
import com.demo.service.AdminService;


@RestController
public class AdminController{

	@Autowired
	private AdminService service;
	@PostMapping("/admin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return service.addAdmin(admin);
	}

	@PutMapping("/admin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		return service.updateAdmin(admin);
	}

	@GetMapping("/admins")
	public List<Admin> getAllAdmins() {
		return service.getAllAdmins();
	}

}
