package com.structural.adapter.example1;

public class EmployeeAdapterLdap implements Employee {

	private EmployeeLdap instance;
	
	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

	@Override
	public String toString() {
		return "EmployeeAdapterLdap [" + 
				"id=" + instance.getCn() + '\'' + 
				", firstName= " + instance.getGivenName() + '\'' + 
				", lastName= " + instance.getSurname() + '\'' +
				", email = " + instance.getMail() + '\'' +
				"]";
	}

	
}
