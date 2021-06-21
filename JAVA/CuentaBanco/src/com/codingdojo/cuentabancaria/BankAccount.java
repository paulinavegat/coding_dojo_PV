package com.codingdojo.cuentabancaria;

import java.util.Random;

//atributos para cada cuenta
public class BankAccount {
	public String numeroCuentaAhorro;
	public String numeroCuentaCorriente;
	private double saldoCuentaCorriente=0;
	private double saldoCuentaAhorro=0;
	public static int numeroDeCuentas;
	private static Random aleatorio = new Random();

	// El método estatico genera un nuevo numero de cuenta aleatorio
		public static String aleatorioAhorro() {
			return Integer.toString(aleatorio.nextInt(1000000000)+1000000000);
		}	
		
		public static String aleatorioCorriente() {
			return Integer.toString(aleatorio.nextInt(1000000000)+1000000000);
		}
		
		// Constructores
		public BankAccount() {
		this.numeroCuentaAhorro = BankAccount.aleatorioAhorro();
		this.saldoCuentaAhorro = 0;	
		this.numeroCuentaCorriente = BankAccount.aleatorioCorriente();
		this.saldoCuentaCorriente = 0;
		numeroDeCuentas+=2;
		}
	
		//getters y setters
	public String getNumeroCuentaAhorro() {
	return numeroCuentaAhorro;
}

	public String getNumeroCuentaCorriente() {
		return numeroCuentaCorriente;
	}
   
   public double getSaldoCuentaCorriente(double d) {
	return saldoCuentaCorriente;
}

public void setSaldoCuentaCorriente(double cantidad) {
	this.saldoCuentaCorriente +=cantidad;
}

public double getSaldoCuentaAhorro(double d) {
	return saldoCuentaAhorro;
}

public void setSaldoCuentaAhorro(double cantidad) {
	this.saldoCuentaAhorro +=cantidad;
}


//depositos y giros por tipo de cuenta

public void depositoCuentaAhorro (double cantidad) {
		this.saldoCuentaAhorro+=cantidad;
		System.out.println("\nSe ha depositado $" + Double.toString(cantidad)+ " a tu cuenta de ahorro.");
	}  
	   
   
   public void depositoCuentaCorriente (double cantidad) {
		this.saldoCuentaCorriente+=cantidad;
		System.out.println("\nSe ha depositado $" + Double.toString(cantidad)+ " a tu cuenta corriente.");
	}
	   
	
	public void giroCuentaAhorro(double cantidad) {
		if(this.saldoCuentaAhorro >= cantidad) {
			this.saldoCuentaAhorro -= cantidad;
			System.out.println("Se ha realizado un giro por  $"+Double.toString(cantidad)+" de tu cuenta de ahorro.");
		}
		else {
			System.out.println("\nNo se ha podido realizar el giro. Saldo insuficiente en su cuenta de ahorro.\nSaldo actual: "+ this.saldoCuentaAhorro);
		}
	
	}     
  
	public void giroCuentaCorriente(double cantidad) {
		if(this.saldoCuentaCorriente >= cantidad) {
			this.saldoCuentaCorriente -= cantidad;
			System.out.println("Se ha realizado un giro por $"+Double.toString(cantidad)+" de tu cuenta corriente.");
			
		}
		else {
			System.out.println("\nNo se ha podido realizar el giro. Saldo insuficiente en su cuenta corriente.\nSaldo actual: "+ this.saldoCuentaCorriente);
		}
		
	}   

	// el saldo total de la cuenta
	
	public void balanceTotal() {
		System.out.println("Balance Total: Cuenta de Ahorro: $" + Double.toString(this.saldoCuentaAhorro) + " + Cuenta Corriente: $" + Double.toString(this.saldoCuentaCorriente) + " Total: $" + Double.toString(this.saldoCuentaAhorro + this.saldoCuentaCorriente));
	}


	

}

   
