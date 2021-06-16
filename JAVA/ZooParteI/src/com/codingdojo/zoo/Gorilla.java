package com.codingdojo.zoo;
public class Gorilla extends Mammal {
	//Ya que Gorilla class extends mammal, tenemos acceso a los métodos de Mammal class, los cuales permitirán ver  el uso los siguientes métodos
	
	
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("Lanzando cosas a la gente...");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	// Tirar un objecto, dará como resultado un mensaje que disminuya la energía en -5
		

	public void eatBananas() {
		System.out.println("Comiendo bananas...");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	// Comer bananas dará como resultado un mensaje diciendo que incrementa la energía en 10
		
	
	public void climb() {
		System.out.println("Escalando...");	
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
	// Escalar un árbol dará como resultado un mensaje y además disminuirá su nivel de energía en -10
	
}
