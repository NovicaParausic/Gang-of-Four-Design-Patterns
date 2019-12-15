package com.creational.builder.example1;

public class User {

	private final String firstName;
	private final String lastName;
	private final String phone;
	private final String address;
	private final int age;

	public User(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phone = builder.phone;
		this.address = builder.address;
		this.age = builder.age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [" + 
				"firstName=" + firstName + '\'' +
				", lastName=" + lastName + '\'' +
				", phone=" + phone + '\'' + 
				", address=" + address + '\'' +
				", age=" + age + '\'' + 
				"]";
	}
	
	public static class Builder {
		private final String firstName;
		private final String lastName;
		private String phone;
		private String address;
		private int age;
		
		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public Builder withAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder withPhone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
}
