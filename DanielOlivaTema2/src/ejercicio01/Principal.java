package ejercicio01;

import adicionales.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1Teclado, numero2Teclado;
		
		System.out.println("Ingresa un número entero");
		
		numero1Teclado=Leer.datoInt();
		
		System.out.println("Ingresa otro número entero");
		
		numero2Teclado=Leer.datoInt();
		
		if (numero1Teclado>numero2Teclado) {
			
			System.out.println("\n"+numero1Teclado+" es mayor que "+numero2Teclado);
			
		}
		else {
			
			System.out.println("\n"+numero2Teclado+" es mayor que "+numero1Teclado);
			
		}
		if (numero1Teclado==numero2Teclado) {
			
			System.out.println("\n"+numero1Teclado+" es igual que "+numero2Teclado);
			
		}
	}

}
