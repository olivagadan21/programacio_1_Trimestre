package ejercicio04;

import adicionales.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, maximo=10, minimo=0;
		
		System.out.println("INTRODUZCA UN N�MERO ENTRE 0 Y 10.");
		
		numero=Leer.datoInt();
		
		if (numero<=maximo && numero>=minimo) {
			
			if (numero==0||numero==2||numero==4||numero==6||numero==8||numero==10) {
				
				System.out.println("\nEl n�mero "+numero+" es Par.");
				
			}
			
			else {
				
				System.out.println("\nEl n�11mero "+numero+" es Impar.");
				
			}
			
		}
		else {
			
			System.out.println("\nPor favor, un n�mero entre 0 y 10.");
			
		}
		
	}

}
