package com.codingdojo.maestrobjetos;
public class HumanTest {


		public static void main(String[] args) {
				Human ninja1 = new Human("Pedro");
				Human samurai1 = new Human("Juan");
				Human wizard1 = new Human("Diego");
				
				wizard1.attack(ninja1);
				samurai1.attack(ninja1);
				ninja1.attack(samurai1);
		}
	}