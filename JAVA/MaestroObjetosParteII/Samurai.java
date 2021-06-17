package com.codingdojo.maestrobjetos;

public class Samurai extends Human {
	static int samuraiCount = 0;
	
	//Constructor
	public Samurai() {
		this.health = 200;
		samuraiCount +=1;
	}
	public Samurai(String name) {
		this.health = 200;
		this.name = name;
		samuraiCount +=1;
	}
	
	//Metodos
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth()/2);
		System.out.println(human.getName() +", " + this.getName() +" te está adivirtiendo" + " ¡Ha llegado tu hora, despidete de este mundo!");
	}
	public void meditate() {
		this.setHealth(this.getHealth() + this.getHealth()/2);
		System.out.println("(¡" + this.getName() + " esta sanando su interior por " + this.getHealth() / 2 + " puntos!)");
	}
	public int howMany() {
		System.out.println(samuraiCount);
		return samuraiCount;
	}
}