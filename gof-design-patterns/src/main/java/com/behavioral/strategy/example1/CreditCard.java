package com.behavioral.strategy.example1;

public class CreditCard {

	private String number;
	private String date;
	private String cvv;
	private ValidationStrategy strategy;
	
	public CreditCard(ValidationStrategy strategy) {
		this.strategy = strategy;
	}

	public boolean isValid() {
		return strategy.isValid(this);
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public ValidationStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(ValidationStrategy strategy) {
		this.strategy = strategy;
	}
		
}
