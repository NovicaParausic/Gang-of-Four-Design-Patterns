package com.structural.decorator.example1;

public class DecoartorDemo1 {

	public static void main(String[] args) {
		
		Sandwich  sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}
}
