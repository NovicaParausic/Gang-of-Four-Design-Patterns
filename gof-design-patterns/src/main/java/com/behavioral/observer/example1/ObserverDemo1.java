package com.behavioral.observer.example1;

public class ObserverDemo1 {

	public static void main(String[] args) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TableClient tableClient = new TableClient(subject);
		
		phoneClient.addMessage("Here is a new message");
		phoneClient.addMessage("Another new message");
	}

}
