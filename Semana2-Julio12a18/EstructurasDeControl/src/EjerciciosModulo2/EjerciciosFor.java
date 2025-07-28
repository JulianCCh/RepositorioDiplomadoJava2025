package EjerciciosModulo2;

public class EjerciciosFor {
	
	public static void main(String args[]) {

		// EJERCICIO 1:
		// Desarrolla un programa que permita mostrar el factorial de un número definido
		// previamente.

		int factorial = 5;
		long resultado = 1;

		for (int i = 1; i <= factorial; i++) {
			resultado = resultado * i;
		}

		System.out.println("El factorial de " + factorial + " es: " + resultado);
		System.out.println();		
		
		// EJERCICIO 2: 
		// Desarrollar un programa que determine los divisores de un número definido
		// previamente.

		int dividendo = 73;
		int divisor = 0;

		System.out.println("Estos son los divisores de " + dividendo + ":");

		for (int i = 1; i <= dividendo; i++) {

			if (dividendo % i == 0) {
				divisor = i;
				System.out.println(divisor);
			}
			divisor = 0;
		}

		System.out.println();
		
		// EJERCICIO 3:
		// Desarrollar un programa que permita definir si un número entero ya
		// establecido es un número perfecto o no.

		int numPerfecto = 6, sumaPerfecto = 0;
		
		System.out.println("Estos son los divisores de " + numPerfecto + ":");

		for (int i = 1; i < numPerfecto; i++) {

			if (numPerfecto % i == 0) {
				sumaPerfecto += i;	
				divisor = i;
				System.out.println(divisor);				
			}
			divisor = 0;
		}
		System.out.println("Resultado de la suma de los divisores propios del numero " + numPerfecto + ": " + sumaPerfecto);
		
		if (numPerfecto == sumaPerfecto) {
			System.out.println("El numero "+ numPerfecto + " es un numero perfecto");
			
		} else {
			System.out.println("El numero "+ numPerfecto + " NO es un numero perfecto");
			
		}
		
		System.out.println();
		
		/*EJERCICIO 4:
	    Desarrollar un programa que realice la sumatoria de todas las
		iteraciones de un ciclo desde 0 hasta un número entero definido
		previamente, al resultado de la suma realizar las siguientes
		operaciones.
		- Raíz cuadrada.
		- Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
		- Determinar los divisores.
		- Hallar la factorial.
		- Definir si es un número perfecto.
		*/
		
		int limite = 20, sumaLimite = 0, numAleatorio;
		double raiz = 0;
		sumaPerfecto = 0;
		factorial = 1;
		divisor = 0;
		
		for (int i = 0; i < limite; i++) {
			sumaLimite += i; 
		}
		
		System.out.println("La suma de la interacciones del ciclo con limite en " + limite +" es: "+ sumaLimite);		
		
		raiz = Math.sqrt(sumaLimite);
		System.out.println("La raiz cuadrada de " + sumaLimite + " es: " + raiz);
		numAleatorio = (int) (Math.random()*sumaLimite);		
		System.out.println("Numero aleatorio enrte 0 y " + sumaLimite + ": " + numAleatorio);
		
		System.out.println("Divisores de " + sumaLimite);
		
		for (int i = 1; i < sumaLimite; i++) {
			
			if (sumaLimite % (i) == 0) {
				divisor = i;
				sumaPerfecto += i; 
				System.out.println(divisor);				
			}
			
			factorial = factorial * i;			
		}
		
		System.out.println("el factorial de " + sumaLimite + " es: " + factorial);
		System.out.println("El resultado de la suma de los divisores propios de " + sumaLimite + " es: " + sumaPerfecto);
		
		
		if (sumaPerfecto == sumaLimite) {
			
			System.out.println(sumaLimite + " Es un numero perfecto");
		} else {
			System.out.println(sumaLimite + " NO es un numero perfecto");
			
		}

	}

}
