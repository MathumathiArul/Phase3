package com.demo.service;

import java.util.List;

import com.demo.model.Admin;

public interface AdminService {
	public Admin addAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public List<Admin> getAllAdmins();
	
}
