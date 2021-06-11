package br.com.designpattern.mhrs.criacionais.builders.functional.model;

public class Car {
	
	private final String id;
	private final String model;
	private final Double price;
	private final Boolean isPaid;
	
	public Car(String id, String model, Double price, Boolean isPaid) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.isPaid = isPaid;
	}
	
	public String getId() {
		return id;
	}
	
	public String getModel() {
		return model;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Boolean getIsPaid() {
		return isPaid;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + ", isPaid=" + isPaid + ", getId()=" + getId()
				+ ", getModel()=" + getModel() + ", getPrice()=" + getPrice() + ", getIsPaid()=" + getIsPaid()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	public static class Builder {
		// requireds
		protected String id;
		
		// optionals
		protected String model;
		protected Double price;
		protected Boolean isPaid;
		
		/**
		 * builder - parameteres 'id' is required
		 * @param id
		 * */
		public Builder(String id) {
			this.id = id;
		}
		
		public Builder model(String model) {
			this.model = model;
			return this;
		}
		
		public Builder price(Double price) {
			this.price = price;
			return this;
		} 
		
		public Builder isPaid(Boolean isPaid) {
			this.isPaid = isPaid;
			return this;
		} 
		
		public Car build() {
			return new Car(id, model, price, isPaid);
		}
	}
}
