package br.com.designpattern.mhrs.estruturais.decorator.decorators;

import br.com.designpattern.mhrs.estruturais.decorator.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}
