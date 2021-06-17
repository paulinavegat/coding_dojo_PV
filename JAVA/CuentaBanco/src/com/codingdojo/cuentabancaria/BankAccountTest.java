package com.codingdojo.cuentabancaria;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount p1 = new BankAccount();
		BankAccount p2 = new BankAccount(1000, 2000);
		BankAccount p3 = new BankAccount(100, 500);
		
		p1.balanceTotal();
		p3.balanceTotal();
		
       System.out.println("----------------------------------------");		
		p1.depositarDinero(1598000.0, "saldoCuentaAhorro");
		p2.retirarDinero(3040.0, "saldoCuentaAhorro");
		p3.retirarDinero(100.0, "saldoCuentaCorriente");
		p1.retirarDinero(100.0, "saldoCuentaCorriente");
		
		System.out.println("----------------------------------------");		
		
		p1.balanceTotal();
		p2.balanceTotal();
		p3.balanceTotal();
		
		
		
		System.out.println(BankAccount.numeroDeCuentas);
		System.out.println("----------------------------------------");	
		System.out.println(BankAccount.cantidadDinero);
		
	}
	
	
}