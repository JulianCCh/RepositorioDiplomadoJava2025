package EjerciciosModulo2;

public class EjerciciosMatrices {
	
	public static void main (String args[]) {
		/* EJERCICIO 1: 
		 * Desarrollar un programa que por medio de tres (3) matrices de
		 * N*M (Determinar el tamaño, igual para las 3 matrices): 
		 * - Almacenar números pares aleatorios entre 0 y 100 en la primera matriz. 
		 * - Almacenar números impares aleatorios entre 0 y 50 en la segunda matriz. 
		 * - Almacenar la suma de los valores de ambas matrices en la tercera matriz.
		 */
		
		int[][] paresAleatorios = new int[3][5], imparesAleatorios = new int[3][5], sumaAleatorios = new int[3][5];

		for (int i = 0; i < sumaAleatorios.length; i++) {

			for (int j = 0; j < sumaAleatorios[0].length; j++) {

				int aleatorio;
								
				boolean esPar = false;

				while (!esPar) {
					
					aleatorio = (int) (Math.random() * 100);

					if (aleatorio % 2 == 0) {

						paresAleatorios[i][j] = aleatorio;

						esPar = true;

					}
				}
				
				while (esPar) {
					
					aleatorio = (int) (Math.random() * 50);

					if (aleatorio % 2 != 0) {

						imparesAleatorios[i][j] = aleatorio;

						esPar = false;

					}
				}

				sumaAleatorios[i][j] = paresAleatorios[i][j] + imparesAleatorios[i][j];
			}
		}

		System.out.println("***Matriz de numeros pares***");
		for (int i = 0; i < sumaAleatorios.length; i++) {
			for (int j = 0; j < sumaAleatorios[0].length; j++) {
				System.out.print(paresAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("***Matriz de numeros impares***");
		for (int i = 0; i < sumaAleatorios.length; i++) {
			for (int j = 0; j < sumaAleatorios[0].length; j++) {
				System.out.print(imparesAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("***Matriz suma pares e impares***");
		for (int i = 0; i < sumaAleatorios.length; i++) {
			for (int j = 0; j < sumaAleatorios[0].length; j++) {
				System.out.print(sumaAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		/*EJERCICIO 2:
		 * Desarrollar un programa que dada una matriz de números enteros
		 * entre 0 – 50 de 5*3, hallar el número mayor almacenado: 
		 * - Puedes utilizar variables auxiliares. 
		 */
		
		int[][] mayorValor = new int[5][3];
		int mayor = 0;
		
		for (int i = 0; i < mayorValor.length; i++) {
			for (int j = 0; j < mayorValor[0].length; j++) {
				
				mayorValor[i][j]= (int) (Math.random() * 50);
				
				if (mayorValor[i][j] >= mayor) {
					
					mayor = mayorValor[i][j];					
				}				
			}			
		}
				
		System.out.println("***Matriz enteros de 0 - 50***");
		
		for (int i = 0; i < mayorValor.length; i++) {
			for (int j = 0; j < mayorValor[0].length; j++) {
				
				System.out.print(mayorValor[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("El valor mas alto es: " + mayor);		
		System.out.println();
		
		/*EJERCICIO 3:
		 * Desarrollar un programa que dada una matriz 3*4 con números aleatorios,
		 * imprimir de la matriz sólo lo siguiente: 
		 * - La primera fila 
		 * - La segunda columna 
		 * - La tercera fila
		 */
		
		int[][] matriz = new int[3][4];
		
		System.out.println("Matriz aleatoria");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random() * 100);
				System.out.print(matriz[i][j] + " ");				
			}
			System.out.println();				
		}
		
		System.out.println("Primera fila de la matriz:");
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.print(matriz[0][i] + " ");				
		}
		
		System.out.println();				
		System.out.println("Segunda columna de la matriz:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(matriz[i][1]);				
		}
		
		System.out.println("Tercera fila de la matriz:");
		for (int i = 0; i < matriz[0].length; i++) {
			System.out.print(matriz[2][i] + " ");				
		}		
	}

}
