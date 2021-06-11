package br.com.designpattern.mhrs.comportamentais.observer.subject;

import java.util.ArrayList;
import java.util.List;

import br.com.designpattern.mhrs.comportamentais.observer.observers.Observer;

public abstract class Subject {

	private List<Observer> observers = new ArrayList<>();

	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers(boolean status) {
		for(Observer o: observers) {
			o.update(status);
		}
	}
	
}
