
package com.codingdojo.zoo;

public class Bat extends Mammal {
	//Ya que Bat class extends mammal, tenemos acceso a los métodos de Mammal class, los cuales permitirán ver  el uso los siguientes métodos

	public Bat() {
		this.setEnergyLevel(300);
	}
	//  Su valor de energía predeterminado es mucho más alto que el de la mayoría de los mamíferos, su nivel de energía es de 300
	// el constructor establece un nivel de energía de 300
	// sobre escribiendo "override" el nivel de energía de 100 predeterminado para los otros mamíferos del zoo
	
	public void fly() {
		System.out.println("sonidos aterradores emite el raro especimen");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	// mostrar el sonido que hace el Bat al despegar y disminuir su nivel de energía en 50.
	
	public void eatHuman() {
		System.out.println("bueno, no importa");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	// comer humano le da energías a este murciélago e incrementar su nivel  en 25.
	
	public void attackTown() {
		System.out.println("La ciudad está ardiendo en llamas y el murciélago gigante disminuye su nivel de energía");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
	// mostar en pantalla el sonido de la ciudad en llamas y disminuir su nivel de energía en 100.
	
	
	
}