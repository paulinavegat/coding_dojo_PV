package com.codingdojo.cuentabancaria;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount p1 = new BankAccount();
		BankAccount p2 = new BankAccount();

		
		System.out.println("\n----------------------------------------\n");
		System.out.println("Num. Cuenta de Ahorro: "+ p1.getNumeroCuentaAhorro() +"\nNum. Cuenta Corriente: "+ p1.getNumeroCuentaCorriente());
		p1.setSaldoCuentaAhorro(200.0);
 		p1.setSaldoCuentaCorriente(1000000.0);
 		System.out.println("Saldo Inicial Cuenta de Ahorro: $"+ p1.getSaldoCuentaAhorro(0));
 		System.out.println("Saldo Inicial Cuenta Corriente: $"+ p1.getSaldoCuentaCorriente(0));
		p1.depositoCuentaAhorro(1598000.0);
		p1.giroCuentaCorriente(100.0);
		p1.balanceTotal();
		
		System.out.println("\n----------------------------------------\n");
		System.out.println("Num. Cuenta de Ahorro: "+ p2.getNumeroCuentaAhorro()+"\nNum. Cuenta Corriente: "+ p2.getNumeroCuentaCorriente());
		p2.setSaldoCuentaAhorro(5000.0);
 		p2.setSaldoCuentaCorriente(60000.0);
 		System.out.println("Saldo Inicial Cuenta de Ahorro: $"+ p2.getSaldoCuentaAhorro(0));
 		System.out.println("Saldo Inicial Cuenta Corriente: $"+ p2.getSaldoCuentaCorriente(0));
		p2.depositoCuentaCorriente(30000);
		p2.giroCuentaCorriente(2000);
		p2.giroCuentaAhorro(100);
		p2.balanceTotal();
		System.out.println("\n----------------------------------------\n");		

		System.out.println("El total de número de cuentas es: "+ BankAccount.numeroDeCuentas);
		
	}
	
	
}