package com.creational.abstractfactory.example2;

public class AbstractFactoryDemo2 {

	public static void main(String[] args) {
		CreditCardFactory abstractFactory1 = CreditCardFactory.getCreditCardFactory(775);
		CreditCard card1 = abstractFactory1.getCreditCard(CardType.PLATINUM);
		System.out.println(card1);
	
		CreditCardFactory abstractFactory2 = CreditCardFactory.getCreditCardFactory(600);
		CreditCard card2 = abstractFactory2.getCreditCard(CardType.GOLD);
		System.out.println(card2);
	}			
}
