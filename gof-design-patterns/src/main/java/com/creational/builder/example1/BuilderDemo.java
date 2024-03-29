package com.creational.builder.example1;

public class BuilderDemo {

	public static void main(String[] args) {
		User user = new User.Builder("John", "Thompson")
				.withAge(25)
				.withPhone("911")
				.withAddress("New York")
				.build();
		
		System.out.println(user);
	}
}
