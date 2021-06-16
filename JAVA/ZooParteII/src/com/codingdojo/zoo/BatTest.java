package com.codingdojo.zoo;

public class BatTest {

	public static void main(String[] args) {
		
		Bat b = new Bat();
		
		b.displayEnergyLevel();
		
		b.attackTown();
		b.attackTown();
		b.attackTown();
		
		b.eatHuman();
		b.eatHuman();
		
		b.fly();
		b.fly();
		
		b.displayEnergyLevel();
	}
	// Se crea Bat y se muestra su nivel de energía inicial.
	// ataque la ciudad tres veces, como dos humanos y vuele dos veces.
	
}