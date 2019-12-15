package com.behavioral.chainofresponsibiltiy.example1;

public abstract class Handler {
	
	protected Handler successor;
	
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	abstract void hadlerRequest(Request request);
}
