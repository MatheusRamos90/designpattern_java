package br.com.designpattern.mhrs.criacionais.abstractfactory.service.factory;

import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.LevelService;
import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.MonsterService;

public interface ServicesAbstractFactory {

	LevelService getLevelService();
	
	MonsterService getMonsterService();
	
}
