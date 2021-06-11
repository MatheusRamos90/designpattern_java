package br.com.designpattern.mhrs.estruturais.mediator.specificmediator;

import br.com.designpattern.mhrs.estruturais.mediator.model.User;
import br.com.designpattern.mhrs.estruturais.mediator.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
	
}
