package com.demo.service;

import java.util.List;

import com.demo.model.Report;

public interface ReportService {
	public Report addReport(Report report);
	public Report updateReport(Report report);
	public void deleteReportById(int id);
	public List<Report> getAllReports();
	public List<Report> getByName(String category);
	public List<Report> getByDate(String date);

}
