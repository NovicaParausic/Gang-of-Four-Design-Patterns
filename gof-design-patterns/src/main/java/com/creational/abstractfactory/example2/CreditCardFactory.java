package com.creational.abstractfactory.example2;

import com.creational.abstractfactory.example2.amexfactory.AmexFactory;
import com.creational.abstractfactory.example2.visafactory.VisaFactory;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if (creditScore > 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator(CardType cardType);
}
