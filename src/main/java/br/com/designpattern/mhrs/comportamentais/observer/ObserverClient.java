package br.com.designpattern.mhrs.comportamentais.observer;

import br.com.designpattern.mhrs.comportamentais.observer.observers.Friend;
import br.com.designpattern.mhrs.comportamentais.observer.observers.Wife;
import br.com.designpattern.mhrs.comportamentais.observer.subject.Doorman;
import lombok.extern.slf4j.Slf4j;

/**
 * - Observer - Definir uma dependência um-para-muitos (1-N) entre objetos para que quando um objeto mudar de estado,
 * todos os seus dependentes sejam notificados e atualizados automaticamente.
 * */
@Slf4j
public class ObserverClient {
	
	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		log.info("Husband is comming");
		doorman.setStatus(true);
	}

}
