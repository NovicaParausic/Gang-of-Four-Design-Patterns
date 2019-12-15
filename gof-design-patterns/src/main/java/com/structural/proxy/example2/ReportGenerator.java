package com.structural.proxy.example2;

public interface ReportGenerator { //SUBJECT

	void displayReportTemplate(String reportFormat, int reportEntries);
	void generateComplexReport(String reportFormat, int reportEntries);
	void generateSensitiveReport();
}
