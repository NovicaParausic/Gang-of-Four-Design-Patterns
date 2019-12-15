package com.creational.abstractfactory.example2.visafactory;

import com.creational.abstractfactory.example2.CardType;
import com.creational.abstractfactory.example2.CreditCard;
import com.creational.abstractfactory.example2.CreditCardFactory;
import com.creational.abstractfactory.example2.Validator;

public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();
		case PLATINUM:
			return new VisaPlatinumCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldValidator();
		case PLATINUM:
			return new VisaPlatinumValidator();
		}
		return null;
	}
}
