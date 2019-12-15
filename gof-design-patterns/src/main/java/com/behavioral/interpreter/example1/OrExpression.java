package com.behavioral.interpreter.example1;

public class OrExpression implements Expression {

	private Expression expr1;
	private Expression expr2;
	
	public OrExpression(Expression espr1, Expression espr2) {
		this.expr1 = espr1;
		this.expr2 = espr2;
	}

	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) || expr2.interpret(context);
	}

}
