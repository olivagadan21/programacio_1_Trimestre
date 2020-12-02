package ejercicio07;


public class Calculo {

	double num1, num2, resul;

	public Calculo(double num1, double num2, double resul) {

		this.num1 = num1;
		this.num2 = num2;
		this.resul = resul;

	}

	public Calculo(double num1, double num2) {

		this.num1 = num1;
		this.num2 = num2;
		
	}

	public double sumar(double num1, double num2) {

		resul = num1 + num2;

		return resul;

	}

	public double restar(double num1, double num2) {

		resul = num1 - num2;

		return resul;

	}

	public double multiplicar(double num1, double num2) {

		resul = num1 * num2;

		return resul;

	}

	public double dividir(double num1, double num2) {
		if(num1<0 | num1>0) {
			
			resul = num1 / num2;
		}
		return resul;

	}

}
