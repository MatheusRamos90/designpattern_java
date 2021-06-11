package br.com.designpattern.mhrs.estruturais.flyweight;

import br.com.designpattern.mhrs.estruturais.flyweight.services.MusicService;

/**
 * Flyweight - User compartilhamento para suportar grandes quantidades de ojetos refinados eficientemente (um tipo de cache).
 * */
public class FlyweigthClient {

	public static void main(String[] args) {
		MusicService player = new MusicService();
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User A", "Be Yourself;Audioslave;200");
		player.listenMusic("User B", "The Unfforgiven;Mettalica;300");
		player.listenMusic("User B", "Be Yourself;Audioslave;200");
		
		player.report();
	}
	
}
