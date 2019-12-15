package com.behavioral.visitor.example1;

public class Oil implements AtvPart{

	@Override
	public void accept(AtvPartsVisitor visitor) {
		visitor.visit(this);
	}

}
