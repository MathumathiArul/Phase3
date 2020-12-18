package com.demo.service;

import java.util.List;

import com.demo.model.Shoe;

public interface ShoeService {

	public Shoe addShoe(Shoe shoe);
	public Shoe updateShoe(Shoe shoe);
	public Shoe getShoeById(int id);
	public void deleteShoeById(int id);
	public List<Shoe> getAllShoes();
	public List<Shoe> getByName(String name);
	public List<Shoe> getShoesByManufacturerName(String manufacturerName);
}
