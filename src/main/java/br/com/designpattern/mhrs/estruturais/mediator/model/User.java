package br.com.designpattern.mhrs.estruturais.mediator.model;

import br.com.designpattern.mhrs.estruturais.mediator.specificmediator.Mediator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class User {
	final protected String name;
	final protected Language language;
	final protected Mediator mediator;
	
	public User(String name, Mediator mediator, Language language) {
		this.name = name;
		this.mediator = mediator;
		this.language = language;
	}

	public String getName() {
		return name;
	}
	public Language getLanguage() {
		return language;
	}
	
	public void sendMessage(String message) {
		this.sendMessage(message, null);
	}

	public void sendMessage(String message, User to) {
		String receiverName = to != null ? to.getName() : "ALL";
		log.info(String.format("'%s' is sending the message '%s' to '%s'", name, message, receiverName));
		mediator.sendMessage(message, to, this);
	}
	
	public void receiveMessage(String message, User from) {
		log.info(String.format("'%s' has recieved the message '%s' from '%s'", name, message, from.getName()));
	}
}
