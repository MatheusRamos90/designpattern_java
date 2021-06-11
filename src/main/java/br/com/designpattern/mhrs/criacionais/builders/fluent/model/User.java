package br.com.designpattern.mhrs.criacionais.builders.fluent.model;

public class User {

	private String id;
	private String name;
	private String numberDocument;
	private Boolean isAdult;
	private EnumGender gender;
	
	public User(String id, String name, String numberDocument, Boolean isAdult, EnumGender gender) {
		super();
		this.id = id;
		this.name = name;
		this.numberDocument = numberDocument;
		this.isAdult = isAdult;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumberDocument() {
		return numberDocument;
	}
	
	public void setNumberDocument(String numberDocument) {
		this.numberDocument = numberDocument;
	}
	
	public Boolean getIsAdult() {
		return isAdult;
	}
	
	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}
	
	public EnumGender getGender() {
		return gender;
	}
	
	public void setGender(EnumGender gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", numberDocument=" + numberDocument + ", isAdult=" + isAdult
				+ ", gender=" + gender + ", getId()=" + getId() + ", getNome()=" + getName() + ", getNumberDocument()="
				+ getNumberDocument() + ", getIsAdult()=" + getIsAdult() + ", getGender()=" + getGender()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	
}
