package com.structural.adapter.example1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "Alex", "Thompson", "john@tompson.com");
		employees.add(employeeFromDB);
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("5432", "Alex", "Johnson", "alex@johnson.com");
		employees.add(new EmployeeAdapterLdap(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("999,Tom,Piterson,tom@peterson.com");
		employees.add(new EmployeeAdapterCSV(employeeFromCSV));
		
		return employees;
	}
}
