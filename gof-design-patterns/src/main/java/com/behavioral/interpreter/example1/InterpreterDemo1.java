package com.behavioral.interpreter.example1;

public class InterpreterDemo1 {

	public static void main(String[] args) {
		String context = "Tgers Bears";
		
		Expression define = buildIterpreterTree();
		System.out.println(context + " is " + define.interpret(context));
	}
	
	private static Expression buildIterpreterTree() {
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3  = new TerminalExpression("Bears");
		
		Expression alternation1 = new AndExpression(terminal1, terminal2);
		Expression alternation2 = new OrExpression(terminal1, alternation1);
		
		return new AndExpression(terminal3, alternation2);
	}
}
