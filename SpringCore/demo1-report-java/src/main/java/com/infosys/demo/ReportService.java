package com.infosys.demo;

public class ReportService {
	
	ReportGenerator master = new PDFReportGenerator();
	int recordsPerPage = 100;
	public void generateReport() {
		System.out.println(master.generateReport(recordsPerPage));
	}
}
