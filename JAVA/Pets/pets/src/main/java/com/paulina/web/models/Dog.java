package com.paulina.web.models;

public class Dog extends Animal implements Pet{
	
	//constructores
	public Dog() {
		
	}
	
	public Dog(String name, String breed, double weight) {
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
	// Overrides  showAffection de la interfaz Pet la cual implementa la clase abstracta ANimal 
	//extendiendose a la clase Dog. 
	
	@Override
	public String showAffection() {
		if(this.getWeight() < 30.0) {
			return this.getName() + " hopped into your lap and cuddled you!";
		}
		else {
			return this.getName() + " curled up next to you!";
		}
	}
}
