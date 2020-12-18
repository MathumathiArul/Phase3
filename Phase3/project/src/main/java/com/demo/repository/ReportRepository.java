package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report,Integer> {
	public List<Report> findByCategory(String category);
	public List<Report> findByDate(String date);

}


