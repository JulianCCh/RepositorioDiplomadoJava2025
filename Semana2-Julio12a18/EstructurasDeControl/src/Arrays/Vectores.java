package Arrays;

import java.util.Scanner;

public class Vectores {
	
	int i=0;
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);

		String[] miFamilia = new String[3];
		miFamilia[0] = "Valentino";
		miFamilia[1] = "Isable";
		miFamilia[2] = "julian";

		for (int i = 0; i < miFamilia.length; i++) {
			System.out.println("miFamilia[" + i + "] - " + miFamilia[i]);

		}

		/*
		 * Desarrollar un programa que, mediante el uso de dos vectores, permita
		 * almacenar las cinco notas de un estudiante para calcular su promedio final.
		 * Los valores para calcular el promedio se encuentran en un vector aparte que
		 * contiene los porcentajes asignados a cada nota.
		 */

		double[] notas ={3.0,4.0,5.0,3.0,4.0};	
		double[] notaPorcentaje = { 20, 10, 30, 20, 20 };

		double promedioFinal = 0;
		
		System.out.println("Registre las notas del estudiante:");

		for (int i = 0; i < notaPorcentaje.length; i++) {
			//notas[i] = scanner.nextDouble();
			promedioFinal += notas[i] * (notaPorcentaje[i] / 100);
		}

		System.out.println("El promerdio del estudiante es: " + Math.round(promedioFinal));
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i] + " ");			
		}
		/*  Dado un vector de cinco nombres, cambie todas
			las letras de los nombres por números, de manera que el nombre termine
			estando compuesto por solo números, por ejemplo:
			1. “DIEGO” – “129851”
			2. “JUAN” – “6731”			
		*/
		
		String[] nombres = {"Diana","Valentino","Julian","Isabel","Alberto"};
		
		char[] caracteres = {'A','B','C','D','E','F','G','H','I','J','K','L',
				'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,
				19,20,21,22,23,24,25,26,27};
		
		String nombreNuevo = "";

		for (int i = 0; i < nombres.length; i++) {			

			char[] charNombre = nombres[i].toCharArray();

			for (int j = 0; j < charNombre.length; j++) {

				for (int k = 0; k < caracteres.length; k++) {
					
					if (Character.toUpperCase(charNombre[j]) == caracteres[k]) {
						
						nombreNuevo = nombreNuevo + numeros[k]  + " ";						
					}					
				}
			}
			
			System.out.println(nombreNuevo);
			nombreNuevo = "";
		}
		
		
	}

}
