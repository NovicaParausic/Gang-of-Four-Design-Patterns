package com.behavioral.visitor.example1;

public interface AtvPartsVisitor {

	void visit(Fender fender);
	
	void visit(Oil oil);
	
	void visit(Wheel wheel);
	
	void visit(PartsOrder partsOrder);
}
