package br.com.designpattern.mhrs.criacionais.abstractfactory.service;

import br.com.designpattern.mhrs.criacionais.abstractfactory.service.factory.RestAbstractFactory;
import br.com.designpattern.mhrs.criacionais.abstractfactory.service.factory.ServicesAbstractFactory;
import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.LevelService;
import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.MonsterService;

/**
 * Abstract Factory = Provê uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
 * */
public class ClientAbstractFactory {

	public static void main(String[] args) {
		ServicesAbstractFactory services = new RestAbstractFactory();
		
		LevelService levelService = services.getLevelService();
		levelService.start();
		
		MonsterService monsterService = services.getMonsterService();
		monsterService.showInformations();
		monsterService.create("Boss X");
	}
	
}
