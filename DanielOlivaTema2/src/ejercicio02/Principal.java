package ejercicio02;

import adicionales.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1, numero2, division, cero=0;
		
		
		System.out.println("Ingrese un número.");
		
		numero1=Leer.datoDouble();
		
		System.out.println("Ingrese otro número.");
		
		numero2=Leer.datoDouble();
		
		division=numero1/numero2;
		
		if (numero2!=cero) {
			
			System.out.printf("\nLa división de %5.2f entre %5.2f es %5.2f .", numero1, numero2, division);
			
		}
		else {
			
			System.out.println("\nNo se puede dividir entre "+cero);
			
		}
		
	}

}
