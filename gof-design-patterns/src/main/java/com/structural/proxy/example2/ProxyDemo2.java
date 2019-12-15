package com.structural.proxy.example2;

public class ProxyDemo2 {

	public static void main(String[] args) {
		Role accessRole = new Role();
		accessRole.setRole("Manager");
		ReportGenerator proxy = new ReportGeneratorImplProxy(accessRole);
		proxy.displayReportTemplate("Pdf", 150);
		proxy.generateComplexReport("Pdf", 150);
		proxy.generateSensitiveReport();
	}

}
