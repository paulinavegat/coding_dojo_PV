package com.codingdojo.zoo;

public class Mammal {

	private int energyLevel = 100;
	// Cada mamifero tendr� 100 de energ�a por defecto seg�n las instrucciones
	
	public Mammal() {}
	// Constructor
		

	public int displayEnergyLevel() {
		System.out.println(this.energyLevel);
		return energyLevel;
	}
	// Esto imprime y retorna, la energ�a del mam�fero
		
		public Integer getEnergyLevel() {
			return energyLevel;
		}

		public void setEnergyLevel(Integer energyLevel) {
			this.energyLevel = energyLevel;
		}
}
		
		// m�todos Getter y setter para los atributos de nivel de energ�a
		