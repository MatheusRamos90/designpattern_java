package br.com.designpattern.mhrs.estruturais.decorator;

import br.com.designpattern.mhrs.estruturais.decorator.decorators.DoubleDrink;
import br.com.designpattern.mhrs.estruturais.decorator.decorators.Milk;
import br.com.designpattern.mhrs.estruturais.decorator.model.Drink;
import br.com.designpattern.mhrs.estruturais.decorator.model.ExpressCoffee;
import br.com.designpattern.mhrs.estruturais.decorator.model.Tea;
import lombok.extern.slf4j.Slf4j;

/**
 * Decorator - Anexar responsabilidades adicionais a um objeto dinamicamente. Decorators oferecem uma alternativa flexível ao uso de herança para estender uma funcionalidade.
 * É feita uma composição usando um decorator.
 * */
@Slf4j
public class ClientDecorator {
	
	public static void main(String[] args) {
		order("Expresso", new ExpressCoffee());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new ExpressCoffee()));
		order("Cafe Au Lait", new Milk(new ExpressCoffee()));
		order("English Tea", new Milk(new Tea()));
	}
	
	public static void order(String name, Drink drink) {
		log.info("Ordering a " + name);
		drink.serve();
		log.info(drink.getPrice().toString());
		log.info("---------------");
	}
	
}
