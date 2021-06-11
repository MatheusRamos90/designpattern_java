package br.com.designpattern.mhrs.criacionais.factory.monsters.factory;

import br.com.designpattern.mhrs.criacionais.factory.monsters.model.Monster;

public abstract class MonstersFactory {
	
	public Monster getInfos() {
		Monster monster = null;
		
		monster = createMonster();

		monster.showInformations();
		
		return monster;
	}
	
	protected abstract Monster createMonster();

}
