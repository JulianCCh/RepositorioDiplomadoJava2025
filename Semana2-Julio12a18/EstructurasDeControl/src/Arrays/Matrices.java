package Arrays;

public class Matrices {
	public static void main (String args[]) {
		
		int matrizUno[][] = new int [4][5];
		int [][]matrizDos = new int [4][5];
		int[][] matrizTres = new int [4][5];
		int matrizCuatro[][];
		int matrizCinco[][] = {};
		int matrizSeis[][] = {{4,6},{7,5}};
		int matrizSiete[][] = new int[][]{{1,3},{4,8}};
		
		/*Desarrollar un programa que, dada una matriz de 5*4, almacene números
		aleatorios entre 0 y 100 en todas sus posiciones. Luego mostrar la matriz en
		forma de tabla.
		*/
		
		String [][] matrizAleatorios = new String[5][4];
		
		for (int i = 0; i < matrizAleatorios.length; i++) {
			for (int j = 0; j < matrizAleatorios[0].length; j++) {
				
				int randomEntero = (int) ( Math.random()*100);  
				matrizAleatorios[i][j] = Integer.toString(randomEntero);
				
				if (matrizAleatorios[i][j].length()<2) {
					
					matrizAleatorios[i][j] = "0" + matrizAleatorios[i][j];										
				}
				System.out.print(matrizAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		/*Con base en el ejercicio anterior, realizar las siguientes operaciones:
		1. Suma de todos los valores.
		2. Resta de todos los valores.
		3. Multiplicación de todos los valores.
		4. Raíz cuadrada de la suma de todos los valores.
		5. División de la multiplicación por la suma.
		*/
		
		int numerosAleatorios[][] = new int [5][4];
		
		int suma = 0, resta = 0, multi = 1;
		double raiz = 0, div = 0;
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[0].length; j++) {
				numerosAleatorios[i][j] = (int) (Math.random()*100);
				System.out.print(matrizAleatorios[i][j] + " ");
				suma += numerosAleatorios[i][j];
				resta -= numerosAleatorios[i][j];
				multi = multi * numerosAleatorios[i][j];
				
				raiz = Math.sqrt(suma);
				
				if (suma > 0) {
					
					div = multi/suma;
					
				}
							
			}
			System.out.println();
		}
		
		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Multiplicacion: " + multi);
		System.out.println("Raiz cuadrada de la suma: " + raiz);
		System.out.println("Division entre multipicacion y suma: " + div);
		
		
		
	}

}
