package br.com.designpattern.mhrs.criacionais.factory.monsters;

import br.com.designpattern.mhrs.criacionais.factory.monsters.factory.M1MonsterFactory;
import br.com.designpattern.mhrs.criacionais.factory.monsters.factory.M2MonsterFactory;
import br.com.designpattern.mhrs.criacionais.factory.monsters.factory.MonstersFactory;
import br.com.designpattern.mhrs.criacionais.factory.monsters.model.Monster;
import lombok.extern.slf4j.Slf4j;

/**
 * Factory - com este padrão é criado fábricas de algo específico (objetos concretos)
 * abaixo temos os exemplos: M1MonsterFactory e M2MonsterFactory
 * */
@Slf4j
public class ClientFactoryMonsters {
	
	public static void main(String[] args) {
		MonstersFactory m1Factory = new M1MonsterFactory();
		MonstersFactory m2Factory = new M2MonsterFactory();
		
		Monster m1Info = m1Factory.getInfos();
		log.info(m1Info.toString());
		
		Monster m2Info = m2Factory.getInfos();
		log.info(m2Info.toString());
	}

}
