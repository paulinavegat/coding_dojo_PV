package com.codingdojo.zoo;

public class Mammal {

	private int energyLevel = 100;
	// Cada mamifero tendrá 100 de energía por defecto según las instrucciones
	
	public Mammal() {}
	// Constructor
		

	public int displayEnergyLevel() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}
	// Esto imprime y retorna, la energía del mamífero
		
		public Integer getEnergyLevel() {
			return energyLevel;
		}

		public void setEnergyLevel(Integer energyLevel) {
			this.energyLevel = energyLevel;
		}
}
		
		// métodos Getter y setter para los atributos de nivel de energía
		