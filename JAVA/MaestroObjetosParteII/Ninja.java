package com.codingdojo.maestrobjetos;

public class Ninja extends Human {

	//Constructor
	public Ninja() {
		this.stealth = 10;
	}
	public Ninja(String name) {
		this.stealth = 10;
		this.name = name;
	}
	
	//Metodo
	public void steal(Human human) {
		human.setHealth(human.getHealth()-stealth);
		this.setHealth(this.getHealth()+stealth);
		System.out.println("Auch!");
		System.out.println("(" + human.getName() + " fuiste atacado por sorpresa por " + this.getName() +", haciendote perder " + stealth + " puntos en salud)");
	}
	public void runAway() {
		this.setHealth(-10);
		System.out.println("¡Es hora de correr por mi vida!");
	}
}