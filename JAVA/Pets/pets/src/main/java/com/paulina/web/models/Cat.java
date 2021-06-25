package com.paulina.web.models;

public class Cat extends Animal implements Pet{
	
	//constructores
	public Cat() {}
	public Cat(String name, String breed, double weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
	// Overrides  showAffection de la interfaz Pet la cual implementa la clase abstracta ANimal 
	//extendiendose a la clase cat. 
	
	@Override
	public String showAffection() {
		return "Your " + this.getBreed() + " cat, " + this.getName() + ", looked at you with some affection. You think so.";
	}
}