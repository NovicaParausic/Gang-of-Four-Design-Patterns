package com.behavioral.observer.example1;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {

	public static void main(String[] args) {
		TwitterStream messageSream = new TwitterStream();
		
		Client client1 = new Client("Bryan");
		Client client2 = new Client("Mark");
		
		messageSream.addObserver(client1);
		messageSream.addObserver(client2);
		
		messageSream.someoneTweeted();
	}
}

class TwitterStream extends Observable {
	
	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}
}

class Client implements Observer {

	private String name;
		
	public Client(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update " + name + "'s stream, someone tweeted something");
	}
	
}