package br.com.designpattern.mhrs.estruturais.mediator.specificmediator;

import java.util.HashMap;
import java.util.Map;

import br.com.designpattern.mhrs.estruturais.mediator.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Mediator {

	protected Map<String, User> users = new HashMap<>();

	public void addUser(User user) {
		log.info(String.format("'%s' is in the room", user.getName()));
		users.put(user.getName(), user);
	}
	
	public void removeUser(User user) {
		log.info(String.format("'%s' is out", user.getName()));
		users.remove(user.getName());
	}

	public void sendMessage(String message, User to, User from) {
		if (to == null) {
			for (User user : users.values()) {
				if (user.getName().equals(from.getName()))
					continue;
				user.receiveMessage(getMessage(message, user, from), from);
			}
		} else {
			to.receiveMessage(getMessage(message, to, from), from);
		}
	}

	protected abstract String getMessage(String message, User to, User from);
	
}
