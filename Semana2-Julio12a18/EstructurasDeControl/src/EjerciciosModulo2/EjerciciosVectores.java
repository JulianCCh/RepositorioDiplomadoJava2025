package EjerciciosModulo2;

import java.util.Scanner;

public class EjerciciosVectores {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		/* EJERCICIO 1:
		 * Desarrollar un programa que por medio de un vector de tipo float permita
		 * almacenar el peso de 5 personas para posteriormente: 
		 * - Determinar el promedio del peso de las 5 personas. 
		 * - Determinar cuántas personas superar el promedio del peso. 
		 * - Determinar cuántas personas son inferiores al promedio del peso.
		 */
		float[] weigth = new float[5];		
		float promedio=0;
		int superiores=0, inferiores=0;
		
		System.out.println("Peso de 5 personas");
		for (int i = 0; i < weigth.length; i++) {
			//System.out.println("Digite el paso de persona " + i);
			//weigth[i] = scn.nextFloat();
			weigth[i] = (float) Math.random()*100;
			promedio +=  weigth[i];
			System.out.println(weigth[i]);
			
		}
		System.out.println("Promedio de peso de las 5 personas: " + (promedio/weigth.length));
		
		for (int i = 0; i < weigth.length; i++) {
			if (weigth[i] > (promedio/weigth.length)) {
				superiores++;
			}else {
				inferiores++;
			}
		}
		
		System.out.println("Personas encima del promedio: " + superiores);
		System.out.println("Personas debajo del promedio: " + inferiores);
		System.out.println();
		
		/* EJERCICIO 2:
		 * Desarrollar un programa que dados dos grupos (Grupo A – Grupo B) cada uno con
		 * 10 estudiantes y una nota final de la materia por estudiante, determinar: 
		 * -El promedio general de cada grupo. 
		 * -El promedio general de ambos grupos. 
		 * -El grupo con mejor promedio.
		 */
		
		double[] grupoA = new double[10], grupoB = new double[10];
		double suma=0,promA=0,promB=0,general;
		
		for (int i = 0; i < grupoB.length; i++) {
			grupoA[i]= (Math.random()*4)+1;
			grupoB[i]= (Math.random()*4)+1;
			promA += grupoA[i];
			promB += grupoB[i];			
		}
		promA = promA/grupoA.length;
		promB = promB/grupoA.length;
		general = (promA +promB)/2;
		
		System.out.println("Grupo A");			
		for (int i = 0; i < grupoB.length; i++) {
			System.out.println(grupoA[i]);			
			
		}
		System.out.println("Grupo B");			
		for (int i = 0; i < grupoB.length; i++) {
			System.out.println(grupoB[i]);			
			
		}
		
		System.out.println("El grupo A tiene un promedio de: "+promA);			
		System.out.println("El grupo B tiene un promedio de: "+promB);			
		System.out.println("El promedio general es de: "+general);			
		
		if (promA > promB) {
			System.out.println("El grupo A tiene el mejor promedio");			
		} else {
			System.out.println("El grupo B tiene el mejor promedio");			
		}	
		System.out.println();			
		/* EJERCICIO 3:
		 * Desarrollar un programa que, dada una palabra, divida todos sus caracteres y
		 * los almacene en las posiciones de un vector del tamaño de la palabra, por ejemplo: 
		 * - “Colombia”, tiene 8 palabras, por ende, el vector debe ser de tamaño 8 para almacenar cada carácter.
		 */
		
		String palabra = "Colombia";
		char[] letrasPalabra= palabra.toCharArray();
		char[] letrasPalabra2= new char[palabra.length()];
		
		System.out.println("LatrasPalabras2");			
		for (int i = 0; i < letrasPalabra2.length; i++) {
			letrasPalabra2[i] = palabra.charAt(i);
			System.out.println(letrasPalabra2[i]);			
		}		
		System.out.println("LatrasPalabras");			
		for (int i = 0; i < palabra.length(); i++) {
			System.out.println(letrasPalabra[i]);			
		}
		
	}

}
