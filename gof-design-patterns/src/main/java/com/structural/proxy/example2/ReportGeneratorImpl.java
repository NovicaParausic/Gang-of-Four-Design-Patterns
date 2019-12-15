package com.structural.proxy.example2;

public class ReportGeneratorImpl implements ReportGenerator { //REAL SUBJECT

	public ReportGeneratorImpl() {
		System.out.println("ReportGeneratorImpl instance created");
	}

	@Override
	public void displayReportTemplate(String reportFormat, int reportEntries) {
		
	}

	@Override
	public void generateComplexReport(String reportFormat, int reportEntries) {
		System.out.println("ReportGeneratorImpl: Generating complex report in " + reportFormat + 
							" format with " + reportEntries + " entries");
	}

	@Override
	public void generateSensitiveReport() {
		System.out.println("ReportingGeneratorImpl: Generating sensitive report");
	}
}
