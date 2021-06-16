package com.codingdojo.zoo;
public class Gorilla extends Mammal {
	//Ya que Gorilla class extends mammal, tenemos acceso a los m�todos de Mammal class, los cuales permitir�n ver  el uso los siguientes m�todos
	
	
	public Gorilla() {
		super();
	}
	public void throwSomething() {
		System.out.println("Lanzando cosas a la gente...");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	// Tirar un objecto, dar� como resultado un mensaje que disminuya la energ�a en -5
		

	public void eatBananas() {
		System.out.println("Comiendo bananas...");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	// Comer bananas dar� como resultado un mensaje diciendo que incrementa la energ�a en 10
		
	
	public void climb() {
		System.out.println("Escalando...");	
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
	// Escalar un �rbol dar� como resultado un mensaje y adem�s disminuir� su nivel de energ�a en -10
	
}
