package com.behavioral.observer.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();
	
	abstract void setState(String state);
	
	abstract String getState();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void dettach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
