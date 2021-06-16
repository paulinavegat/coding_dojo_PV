
package com.codingdojo.zoo;

public class Bat extends Mammal {
	//Ya que Bat class extends mammal, tenemos acceso a los m�todos de Mammal class, los cuales permitir�n ver  el uso los siguientes m�todos

	public Bat() {
		this.setEnergyLevel(300);
	}
	//  Su valor de energ�a predeterminado es mucho m�s alto que el de la mayor�a de los mam�feros, su nivel de energ�a es de 300
	// el constructor establece un nivel de energ�a de 300
	// sobre escribiendo "override" el nivel de energ�a de 100 predeterminado para los otros mam�feros del zoo
	
	public void fly() {
		System.out.println("sonidos aterradores emite el raro especimen");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	// mostrar el sonido que hace el Bat al despegar y disminuir su nivel de energ�a en 50.
	
	public void eatHuman() {
		System.out.println("bueno, no importa");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	// comer humano le da energ�as a este murci�lago e incrementar su nivel  en 25.
	
	public void attackTown() {
		System.out.println("La ciudad est� ardiendo en llamas y el murci�lago gigante disminuye su nivel de energ�a");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
	// mostar en pantalla el sonido de la ciudad en llamas y disminuir su nivel de energ�a en 100.
	
	
	
}