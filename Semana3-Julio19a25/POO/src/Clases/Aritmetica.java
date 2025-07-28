package Clases;

public class Aritmetica {
	public int suma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public int resta(int numero1, int numero2) {
		return numero1 - numero2;
	}
	
	public int multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	public double division(int numero1, int numero2) {
		return numero1 / numero2;
	}
	
	public static void main (String args[]) {
		
		Aritmetica operaciones = new Aritmetica();
		
		int numero1 = 8;
		int numero2 = 6;
		
		System.out.println("Suma " + operaciones.suma(numero1, numero2));
		System.out.println("Resta " + operaciones.resta(numero1, numero2));
		System.out.println("Multiplicacion " + operaciones.multiplicacion(numero1, numero2));
		System.out.println("Division " + operaciones.division(numero1, numero2));
				
	}
}
