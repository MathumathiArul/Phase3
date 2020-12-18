package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Report;
import com.demo.repository.ReportRepository;
import com.demo.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private ReportRepository repository;
	@Override
	public Report addReport(Report report) {
		// TODO Auto-generated method stub
		return repository.save(report);
	}

	@Override
	public Report updateReport(Report report) {
		// TODO Auto-generated method stub
		return repository.save(report);
	}

	@Override
	public void deleteReportById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public List<Report> getAllReports() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Report> getByName(String category) {
		// TODO Auto-generated method stub
		return repository.findByCategory(category);
	}

	@Override
	public List<Report> getByDate(String date) {
		// TODO Auto-generated method stub
		return repository.findByDate(date);
		}

}
