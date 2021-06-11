package br.com.designpattern.mhrs.estruturais.mediator.model;

import br.com.designpattern.mhrs.estruturais.mediator.specificmediator.Mediator;

public class PortugueseUser extends User {

	public PortugueseUser(String name, Mediator mediator) {
		super(name, mediator, Language.PORTUGUESE);
	}
	
}
