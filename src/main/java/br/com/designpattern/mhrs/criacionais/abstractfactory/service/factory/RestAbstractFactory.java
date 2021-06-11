package br.com.designpattern.mhrs.criacionais.abstractfactory.service.factory;

import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.LevelAPIService;
import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.LevelService;
import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.MonsterAPIService;
import br.com.designpattern.mhrs.criacionais.abstractfactory.service.services.MonsterService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public LevelService getLevelService() {
		return new LevelAPIService();
	}

	@Override
	public MonsterService getMonsterService() {
		return new MonsterAPIService();
	}

}
