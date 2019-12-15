package com.behavioral.visitor.example1;

import java.beans.Visibility;

public class Fender implements AtvPart {

	@Override
	public void accept(AtvPartsVisitor visitor) {
		visitor.visit(this);
	}

}
