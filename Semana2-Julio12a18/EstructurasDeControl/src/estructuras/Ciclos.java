package estructuras;

import java.util.Scanner;

public class Ciclos {
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		// Ciclo for 
		// desarrolle un programa que muestre los numeros del 0 al 20 
		for (int i = 0; i <= 20; i+=2) {
			System.out.print(i+" ");			
		}
		
		System.out.println();
		
		for (int i = 20; i >= 0; i-=2) {
			System.out.print(i + " ");				
		}
		System.out.println();
		
		// Desarrollar un programa que permita contar cuántos números entre 1 y 1000 son múltiplos de 7.
		int contador = 0;
		
		System.out.println("Estos son los numeros multiplos de 7 entre 1 y 100");
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
				contador++;
			}			
		}
		System.out.println("\n"+contador + " multipos de 7");
		
		// Desarrollar un problema que imprimir las tablas de multiplicar del 1 al 10 con su respectivo resultado.
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		// Ciclo while	
		
		boolean x= true;
		int i = 0;
		
		while (x) {
			System.out.println("Ciclo while");
			x = false;
		}
		
		System.out.println("Numeros del 1 al 10 con un ciclo while");
		
		while (i < 10) {
			System.out.println(i+1);
			i++;
		}
		
		//Desarrollar un programa que imprima los números impares entre 1 y 25.
		
		i = 1;
		System.out.println("Numeros impares entre el 1 y 25 con un ciclo while");
		
		while (i <= 25) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
				i++;
		}
		
		//Desarrollar un programa que, dada una palabra, descomponga todos sus caracteres.
		
		System.out.println("Escriba una palabra:");		
		String cadena = "julian";
		
		char[] caracteres = cadena.toCharArray();
		
		for (char letra : caracteres) {
			System.out.println(letra);			
		}		
		
		contador = 0;
		
		while (contador < cadena.length()) {
			System.out.print(cadena.charAt(contador) + " ");
			contador++;
		}
		
		System.out.println();
		
		// Desarrollar un programa que genere números aleatorios entre 1 y 50 y se detenga cuando genere un múltiplo de 10.
		
		boolean centinela = false;
		
		while (!centinela) {
			int limite = 50;
			int numRandom = (int) (Math.random()*limite); 
			System.out.println(numRandom);
			
			int fin = 10;
			
			if (numRandom % fin == 0) {
				centinela = true;
			}			
		}
		
		// Ciclo do while
		
		// ejecuta unas vez las sentencias y luego evalua si continua
		do {
			System.out.println("DO WHILE");			
		} while (false);
		
		// ejecuta las sentencias con i= 0 i, como no es mayor a cinco despues de la ejecucion no continua		
		i = 0;		
		
		do {
			System.out.println(i);
			i++;
		} while (i > 5);
	}

}
