package com.demo.service.impl;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Shoe;
import com.demo.repository.ShoeRepository;
import com.demo.service.ShoeService;



@Service
public class ShoeServiceImpl implements ShoeService {

	@Autowired
	private ShoeRepository repository;

	@Override
	public Shoe addShoe(Shoe shoe) {
		return repository.save(shoe);
	}

	@Override
	public Shoe updateShoe(Shoe shoe) {
		return repository.save(shoe);
	}

	@Override
	public Shoe getShoeById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void deleteShoeById(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Shoe> getAllShoes() {
		return repository.findAll();
	}

	@Override
	public List<Shoe> getShoesByManufacturerName(String manufacturerName) {
		return repository.findByManufacturerName(manufacturerName);
	}

	@Override
	public List<Shoe> getByName(String name) {
		return repository.findByName(name);
	}

}
