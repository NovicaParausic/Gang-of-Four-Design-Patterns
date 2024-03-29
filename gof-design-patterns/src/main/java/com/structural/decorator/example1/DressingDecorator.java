package com.structural.decorator.example1;

public class DressingDecorator extends SandwichDecorator {

	public DressingDecorator(Sandwich customSendwich) {
		super(customSendwich);
	}

	@Override 
	public String make() {
		return customSandwich.make() + addDressing();
	}
	
	private String addDressing() {
		return " + mustard"; 
	}
}
