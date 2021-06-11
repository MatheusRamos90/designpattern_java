package br.com.designpattern.mhrs.estruturais.mediator.model;

import br.com.designpattern.mhrs.estruturais.mediator.specificmediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
