package br.com.designpattern.mhrs.criacionais.factory.monsters.factory;

import br.com.designpattern.mhrs.criacionais.factory.monsters.model.M2Monster;

public class M2MonsterFactory extends MonstersFactory {

	@Override
	protected M2Monster createMonster() {
		return new M2Monster();
	}

}
