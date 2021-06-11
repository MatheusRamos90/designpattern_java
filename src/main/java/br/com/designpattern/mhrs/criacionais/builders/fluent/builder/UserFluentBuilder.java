package br.com.designpattern.mhrs.criacionais.builders.fluent.builder;

import br.com.designpattern.mhrs.criacionais.builders.fluent.model.EnumGender;
import br.com.designpattern.mhrs.criacionais.builders.fluent.model.User;

public class UserFluentBuilder {
	
	// requireds
	private String id;
	private String name;
	
	// optionals
	private String numberDocument;
	private Boolean isAdult;
	private EnumGender gender;
	
	/**
	 * builder - parameteres 'id' and 'name' are required
	 * @param id
	 * @param name
	 * */
	public UserFluentBuilder builder(String id, String name) {
		this.id = id;
		this.name = name;
		return this;
	}
	
	public UserFluentBuilder numberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
		return this;
	}
	
	public UserFluentBuilder isAdult(Boolean isAdult) {
		this.isAdult = isAdult;
		return this;
	}
	
	public UserFluentBuilder gender(EnumGender gender) {
		this.gender = gender;
		return this;
	}
	
	public User build() {
		return new User(id, name, numberDocument, isAdult, gender);
	}
	
}
