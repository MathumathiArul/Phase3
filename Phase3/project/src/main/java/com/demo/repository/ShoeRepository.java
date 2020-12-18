package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.model.Shoe;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe,Integer> {
	public List<Shoe> findByManufacturerName(String manufacturerName);
	public List<Shoe> findByName(String name);
}
