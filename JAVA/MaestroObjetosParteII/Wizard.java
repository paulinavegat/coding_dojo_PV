package com.codingdojo.maestrobjetos;

public class Wizard extends Human {
	
	//Constructor
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public Wizard(String name) {
		this.health = 50;
		this.intelligence = 8;
		this.name = name;
	}

	//Metodo
	public void heal(Human human) {
		human.setHealth(human.getHealth()+intelligence);
		System.out.println("Sana, sana, culito de rana sino sana hoy sanará mañana xD");
		System.out.println("(" + human.getName() + " el poder sanador aumentó tu salud en " + this.intelligence + " puntos.)");
	}
	public void fireball(Human human) {
		human.setHealth(human.getHealth()-(intelligence*3));
		System.out.println("¡¡Esto es solo una advertencia!!");
		System.out.println("(" + human.getName() + " esta bola de fuego ha disminuido tu salud en " + intelligence*3 + " puntos)");
	}
}