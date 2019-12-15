package com.behavioral.observer.example1;

public class TableClient extends Observer {

	public TableClient(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}
	
	public void addMessage(String message) {
		subject.setState(message + " - sent from tablet"); 
	}
	
	@Override
	void update() {
		System.out.println("Tablet Strem: " + subject.getState());
	}

}
