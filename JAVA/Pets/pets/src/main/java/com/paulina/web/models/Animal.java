package com.paulina.web.models;


public abstract class Animal implements Pet{
	// atributos
	private String name;
	private String breed;
	private double weight;
	
	
	//contructores
	public Animal() {
		
	}
	
	public Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
 
	
	
}