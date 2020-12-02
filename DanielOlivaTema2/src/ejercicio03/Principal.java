package ejercicio03;

import adicionales.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sacar, saldo=500, saldoFinal;
		
		System.out.println("\nUsted tiene un saldo de "+saldo+" €.");
		
		System.out.println("\n¿Cuanto dinero desea retirar?");
		
		sacar=Leer.datoInt();
		
		saldoFinal=saldo-sacar;
		
		if (sacar<saldo) {
			
			System.out.println("\nUsted ha retirado "+sacar+" €.");
			System.out.println("\nLe queda en la cuenta "+saldoFinal+" €.");
			
		}
		else {
			
			System.out.println("\nNo tienes tanto dinero, eres pobre.");
			
		}
	}

}
