package com.codingdojo.cuentabancaria;

import java.util.Random;
//atributos para cada cuenta
public class BankAccount {
	private String numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	
	
	// Variables statics
	
	public static int numeroDeCuentas;
	public static double cantidadDinero;
	private static Random aleatorio = new Random();
	
	
	// El m�todo estatico genera un nuevo numero de cuenta aleatorio
	private static String aleatorioNum() {
		return Integer.toString(aleatorio.nextInt(1000000000)+1000000000);
	}	
	

	
	// Constructores
	public BankAccount() {
		this.numeroCuenta = BankAccount.aleatorioNum();
		this.saldoCuentaCorriente = 0;
		this.saldoCuentaAhorro = 0;
		numeroDeCuentas++;
	}
	public BankAccount(double saldoCuentaCorriente, double saldoCuentaAhorro) {
		this.numeroCuenta = BankAccount.aleatorioNum();
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		this.saldoCuentaAhorro = saldoCuentaAhorro;
		numeroDeCuentas++;
		cantidadDinero += (this.saldoCuentaCorriente + this.saldoCuentaAhorro);
	}
	

	// Getters y setters para saldoCuentaAhorro y saldoCuentaCorriente
	public double getsaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}
	public void setsaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}
	public double getsaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}
	public void setsaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}
	
	// Este m�todo permite al cliente se�alar d�nde quiere depositar el dinero
	
	public void depositarDinero(double cantidad, String tipoCuenta) {
		if(tipoCuenta == "saldoCuentaCorriente" || tipoCuenta == "opci�n 1") {
			this.saldoCuentaCorriente += cantidad;
			cantidadDinero += cantidad;
			System.out.println("El monto de: "+ cantidad + " fue depositada en su cuenta corriente n�mero: " + this.numeroCuenta);
		}
		else if(tipoCuenta == "saldoCuentaAhorro" || tipoCuenta == "opci�n 2") {
			this.saldoCuentaAhorro += cantidad;
			cantidadDinero += cantidad;
			System.out.println("El monto de: "+ cantidad + " fue depositada en su cuenta de ahorro n�mero: " + this.numeroCuenta);
		}
		else {
			System.out.println("Intenta hacer un dep�sito a la cuenta incorrecta. Por favor elegir 'opci�n 1' para su Cuenta Corrienta u 'opci�n 2' para Cuenta de Ahorro.");
		}
	}
	
	// El m�todo para girar dinero permite al cliente especificar el monto ya sea para cuenta corriente o de ahorror
		// Si intenta girar desde una cuenta incorrecta, se le notificara as� tambi�n si es que no tiene el dinero suficiente.

	
	public void retirarDinero(double cantidad, String tipoCuenta) {
		if(tipoCuenta == "saldoCuentaCorriente" || tipoCuenta == "opci�n 1") {
			if(cantidad <= this.saldoCuentaCorriente) {
				this.saldoCuentaCorriente -= cantidad;
				cantidadDinero -= cantidad;
				System.out.println("El monto de: "+ cantidad + " fue retirado de su cuenta corriente n�mero: " + this.numeroCuenta);
				}
			else {
				System.out.println("El saldo en su cuenta corriente es insuficiente para el monto que desea retirar. Tu saldo actual es: " + this.getsaldoCuentaCorriente());
			
			 }
		  }
		
		else if(tipoCuenta == "saldoCuentaAhorro" || tipoCuenta == "opci�n 2") {
			if(cantidad <= this.saldoCuentaAhorro) {
				this.saldoCuentaAhorro -= cantidad;
				cantidadDinero -= cantidad;
				System.out.println("El monto de: "+ cantidad + " fue retirado de su cuenta de ahorro n�mero: " + this.numeroCuenta);
			}
			else {
				System.out.println("El saldo en su cuenta de ahorro es insuficiente para el monto que desea retirar. Tu saldo actual es: " + this.getsaldoCuentaAhorro());
			}
		  }
		
		
		else {
			System.out.println("Intenta hacer un giro desde una cuenta incorrecta. Por favor elegir 'opci�n 1' para su Cuenta Corrienta u 'opci�n 2' para Cuenta de Ahorro.");
			}
	}
	
// el saldo total de la cuenta
	
	public void balanceTotal() {
		System.out.println("El balance total es: " + (this.getsaldoCuentaCorriente() + this.getsaldoCuentaAhorro()));
	}

	
}