package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Shoe;
import com.demo.service.ShoeService;

@RestController
public class ShoeController  {

	@Autowired
	private ShoeService service;
	
	@PostMapping("/shoe")
	public Shoe addShoe(@RequestBody Shoe shoe) {
		// TODO Auto-generated method stub
		return service.addShoe(shoe);
	}

	@PutMapping("/shoe")
	public Shoe updateShoe(@RequestBody Shoe shoe) {
		// TODO Auto-generated method stub
		return service.updateShoe(shoe);
	}

	@GetMapping("/shoe/{id}")
	public Shoe getShoeById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return service.getShoeById(id);
	}

	@DeleteMapping("/shoe/{id}")
	public void deleteShoeById(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteShoeById(id);
	}

	@GetMapping("/shoes")
	public List<Shoe> getAllShoes() {
		// TODO Auto-generated method stub
		return service.getAllShoes();
	}

	@GetMapping("/shoes/{manufacturerName}")
	public List<Shoe> getShoesByManufacturerName(@PathVariable String manufacturerName) {
		// TODO Auto-generated method stub
		return service.getShoesByManufacturerName(manufacturerName);
	}

}
