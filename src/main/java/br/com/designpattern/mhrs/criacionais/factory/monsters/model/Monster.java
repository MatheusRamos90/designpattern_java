package br.com.designpattern.mhrs.criacionais.factory.monsters.model;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Monster {
	
	public abstract void showInformations();
	
	public void attack01() {
		log.info("Attack 01!!");
	}
	
	public void attack02() {
		log.info("Attack 02!!");
	}
	
	public void jump() {}
}
