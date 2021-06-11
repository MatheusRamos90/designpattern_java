package br.com.designpattern.mhrs.criacionais.factory.monsters.factory;

import br.com.designpattern.mhrs.criacionais.factory.monsters.model.M1Monster;

public class M1MonsterFactory extends MonstersFactory {

	@Override
	protected M1Monster createMonster() {
		return new M1Monster();
	}
	
}
