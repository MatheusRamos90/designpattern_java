package br.com.designpattern.mhrs.estruturais.flyweight.specific;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWeightFactory {
	private static FlyWeightFactory instance = new FlyWeightFactory();
	private static Map<String, MusicFlyweight> musicFlyRepository = new HashMap<>();
	
	public static FlyWeightFactory getInstance() {
		return instance;
	}
	
	public MusicFlyweight getMusic(String desc) {
		MusicFlyweight mf = musicFlyRepository.get(desc);
		if(mf == null) {
			log.info("Creating new Flyweight for " + desc);
			mf = getMusicByString(desc);
			musicFlyRepository.put(desc, mf);
		}
		return mf;
	}
	
	private MusicFlyweight getMusicByString(String desc) {
		String[] musicData = desc.split(";");
		return new MusicFlyweight(musicData[0], musicData[1], Integer.valueOf(musicData[2]));
	}

	public Integer getSize() {
		return musicFlyRepository.size();
	}
}
