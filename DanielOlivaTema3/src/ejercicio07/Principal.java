package ejercicio07;

import adicionales.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int eleccion;
		double num1, num2;
		Calculo c;

		do {
		
		System.out.println("Presiona 1 para sumar");
		System.out.println("Presiona 2 para restar");
		System.out.println("Presiona 3 para multiplicar");
		System.out.println("Presiona 4 para dividir");
		System.out.println("Presiona 0 para terminar");

		eleccion = Leer.datoInt();

		if (eleccion == 1) {

			System.out.println("Introduzca el primer número.");
			num1 = Leer.datoDouble();

			System.out.println("Introduzca el segundo número.");
			num2 = Leer.datoDouble();

			c = new Calculo(num1, num2);

			System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, c.sumar(num1, num2));

		}
		if (eleccion == 2) {

			System.out.println("Introduzca el primer número.");
			num1 = Leer.datoDouble();

			System.out.println("Introduzca el segundo número.");
			num2 = Leer.datoDouble();

			c = new Calculo(num1, num2);

			System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, c.restar(num1, num2));

		}

		if (eleccion == 3) {

			System.out.println("Introduzca el primer número.");
			num1 = Leer.datoDouble();

			System.out.println("Introduzca el segundo número.");
			num2 = Leer.datoDouble();

			c = new Calculo(num1, num2);

			System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, c.multiplicar(num1, num2));

		}

		if (eleccion == 4) {

			System.out.println("Introduzca el primer número.");
			num1 = Leer.datoDouble();

			System.out.println("Introduzca el segundo número.");
			num2 = Leer.datoDouble();

			c = new Calculo(num1, num2);
			
			if(num2<0 | num1>0) {
				
				System.out.printf("%.2f/%.2f = %.2f\n", num1, num2, c.dividir(num1, num2));
			}
			if(num2==0) {
				
				System.out.println("No se puede dividir entre 0.");
				
			}
			
		}
		
		if (eleccion>4) {
			
			System.out.println("De momento no hay tantas opciones\n");
		}
					
		
		
		}while (eleccion!=0);

		}

	}


