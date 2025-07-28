package EjerciciosModulo2;

import java.util.Scanner;

public class EjerciciosComplejosCondicionales {
	public static void main (String args[]) {
		
		Scanner scn = new Scanner(System.in);
		/* EJERCICIO 1:
		 * Desarrollar un programa que permita por medio de la edad de una persona,
		 * determinar la categoría en la que pertenece a raíz de la siguiente tabla:
		 * Rango de edad  Categoría 
		 * 0 - 5          Infante 
		 * 6 - 10         Niño 
		 * 11 - 15        Pre adolescente 
		 * 16 - 18        Adolescente 
		 * 19 - 25        Pre adulto 
		 * 26 - 40        Adulto 
		 * 41 - 55        Pre anciano 
		 * 56+		      Anciano
		 */
		int edad;
		String categoria="";
		
		System.out.println("Digite su edad para conocer su categoria: ");
		edad = scn.nextInt();
		
		if (edad <= 0) {
			System.out.println("La edad no puede un numero negativo o 0");			
		}
		else if (edad > 0 && edad <= 5) {
			categoria = "infante";
		}
		else if (edad > 5 && edad <= 10) {
			categoria = "Niño";
		}
		else if (edad > 10 && edad <= 15) {
			categoria = "Preadolescente";
		}
		else if (edad > 15 && edad <= 18) {
			categoria = "Adolescente";
		}		
		else if (edad > 18 && edad <= 25) {
			categoria = "Preadulto";
		}
		else if (edad > 25 && edad <= 40) {
			categoria = "Adulto";
		}
		else if (edad > 40 && edad <= 55) {
			categoria = "Preanciano";
		}
		else if (edad > 55) {
			categoria = "Anciano";
		}
		
		System.out.println("Pertenece a la categoria: "+categoria);
		System.out.println();
		
		/* EJERCICIO 2:
		 * Desarrollar un programa que permita determinar la cantidad de cifras de un
		 * número X teniendo en cuenta que el número únicamente puede tener 4 cifras.
		 * Mostrar un mensaje por defecto si el número supera las 4 cifras.
		 */
		
		System.out.println("Digite un numero que tenga maximo 4 cifras: ");
		scn = new Scanner(System.in);
		int numero = scn.nextInt();
		
		String numeroString = String.valueOf(numero);
		
		if (numeroString.length() <= 4) {
			System.out.println(numero + " tiene " + numeroString.length() + " cifras");			
		} 
		else {
			System.out.println("el número supera las 4 cifras");			
		}
		System.out.println();
		
		/* EJERCICIO 3:
		 * Desarrollar un programa que, por medio de 3 números enteros, determinar cuál
		 * es el mayor.
		 */
		
		int a,b,c,mayor;
		
		System.out.println("Ingrese 3 numeros enteros cualquiera: ");
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		
		mayor = a;
		
	}	
}
