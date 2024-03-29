package com.behavioral.visitor.example1;

public class AtvPartsDisplayVisitor implements AtvPartsVisitor {

	@Override
	public void visit(Fender fender) {
		System.out.println("We have a fender");
	}

	@Override
	public void visit(Oil oil) {
		System.out.println("We have a oil");
	}

	@Override
	public void visit(Wheel wheel) {
		System.out.println("We have a wheel");
	}

	@Override
	public void visit(PartsOrder partsOrder) {
		System.out.println("We have a order");
	}

}
