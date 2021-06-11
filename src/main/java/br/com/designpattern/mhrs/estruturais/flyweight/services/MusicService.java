package br.com.designpattern.mhrs.estruturais.flyweight.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.com.designpattern.mhrs.estruturais.flyweight.model.Music;
import br.com.designpattern.mhrs.estruturais.flyweight.specific.FlyWeightFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MusicService {
	private Map<String, Map<String, Music>> memory = new HashMap<>();
	
	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = memory.get(user);
		if(userPlayList == null) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}
		
		Music song = userPlayList.get(desc);
		if(song == null) {
			song = new Music(FlyWeightFactory.getInstance().getMusic(desc));
			userPlayList.put(desc, song);
		}
		log.info(String.format("%s is listenning '%s'", 
				user, song.getMusicFlyweight().getName()));
		song.listenning();
	}
	
	public void report() {
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			log.info("---------");
			log.info(user + " has listen...");
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				log.info(String.format("%s/%s %d times", 
						music.getMusicFlyweight().getArtist(), 
						music.getMusicFlyweight().getName(), 
						music.getPlayerQty()));
				timeCounter += (music.getPlayerQty() * music.getMusicFlyweight().getDurationInSeconds());
			}
			log.info(String.format("%s has listen music for %d seconds", user, timeCounter));
		}
		log.info("Total of musics in flyWeight's memory: " + FlyWeightFactory.getInstance().getSize());
	}
}
