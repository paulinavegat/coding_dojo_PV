package com.codingdojo.maestrobjetos;
public class HumanTest {


	public static void main(String[] args) {
		Human Human1 = new Human("Pedro");
		//Human Human2 = new Human("Juan");
		//Human Human3 = new Human("Diego");
		Wizard Wizard1 = new Wizard("HarryPotter");
		//Wizard Wizard2 = new Wizard("Hermione");
		//Wizard Wizard3 = new Wizard("Albus");
		Ninja Ninja1 = new Ninja("JackieChan");
		//Ninja Ninja2 = new Ninja("Leeh");
		//Ninja Ninja3 = new Ninja("Jackie");
		Samurai Samurai1 = new Samurai("Lao");
		Samurai Samurai2 = new Samurai("Chan");
		Samurai Samurai3 = new Samurai("Michael");		
		
		//esto es una batalla humanos - magos encontra de ninjas y samurai, quienes se han unido en duos para pelear
		
		Ninja1.steal(Human1); //Jackie Chan ataca a Diego
		Wizard1.heal(Human1);//Harry Potter sana a Diego
		Wizard1.fireball(Ninja1); //Harry poter en venganza, lanza una bola de fuego a Jackie
		Ninja1.runAway();//Jackie corre por su vida
		Samurai1.attack(Wizard1); //Aparece Lao en defensa de Jackie y ataca a Harry Potter 
		Samurai2.meditate();// se encuentra meditando mientras los otros samurai hacen su trabajo
		Samurai3.deathBlow(Human1); 
		Samurai3.deathBlow(Wizard1);//Aparece un tercer samurai, Michael Choi para asesinar a Diego y Harry.
		Samurai3.howMany();	
		
		
	}
}