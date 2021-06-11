package br.com.designpattern.mhrs.estruturais.mediator;

import br.com.designpattern.mhrs.estruturais.mediator.model.EnglishUser;
import br.com.designpattern.mhrs.estruturais.mediator.model.PortugueseUser;
import br.com.designpattern.mhrs.estruturais.mediator.model.User;
import br.com.designpattern.mhrs.estruturais.mediator.specificmediator.Mediator;
import br.com.designpattern.mhrs.estruturais.mediator.specificmediator.TranslatorMediator;

/**
 * Mediator - Definir um objeto que encapsula como um conjunto de objetos
 * interagem. Mediator promove acoplamento fraco ao manter objetos que não se
 * referem um ao outro explicitamente, permitindo variar sua interação
 * independentemente.
 */
public class MediatorClient {

	public static void main(String[] args) {
		// Mediator chatRoom = new ChatMediator();
		Mediator chatRoom = new TranslatorMediator();

		User alan = new EnglishUser("Alan", chatRoom);
		User jose = new PortugueseUser("Jose", chatRoom);
		User sue = new EnglishUser("Sue", chatRoom);
		User maria = new PortugueseUser("Maria", chatRoom);

		chatRoom.addUser(alan);
		chatRoom.addUser(sue);
		chatRoom.addUser(maria);

		alan.sendMessage("Hello");
		maria.sendMessage("Oi", alan);

		chatRoom.removeUser(sue);

		alan.sendMessage("How are you?", maria);
		maria.sendMessage("Estou bem, obrigado.", alan);

		chatRoom.addUser(jose);

		jose.sendMessage("Oi");

		chatRoom.removeUser(maria);
	}

}
