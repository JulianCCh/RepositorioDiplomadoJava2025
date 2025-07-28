package EjerciciosModulo2;

public class EjerciciosWhile {
	
	public static void main(String args[]) {

		// EJERCICIO 1:
		// Desarrolla un programa que permita invertir la palabra “Programación”.
		// El resultado debe ser “nóicamargorP”

		String palabra = "Programacion", palabraInvertida;
		char[] charPalabra = palabra.toCharArray();
		char[] charInvertida = new char[palabra.length()];
		int contador = 0;

		while (palabra.length() > contador) {

			charInvertida[(palabra.length() - 1) - contador] = charPalabra[contador];
			contador++;
		}

		palabraInvertida = new String(charInvertida);

		System.out.println("Palabra: " + palabra + " Palabra invertida: " + palabraInvertida);
		System.out.println();

		// EJERCICIO 2:
		// Desarrollar un programa que determine si una palabra establecida
		// previamente es o no palíndroma

		palabra = "Anilina";
		palabraInvertida = "";
		contador = palabra.length() - 1;

		while (contador >= 0) {

			palabraInvertida += palabra.charAt(contador);
			contador--;
		}

		if (palabra.equalsIgnoreCase(palabraInvertida)) {
			System.out.println("La palabra " + palabra + " es palindroma");

		} else {
			System.out.println("La palabra " + palabra + " NO es palindroma");

		}

		System.out.println();

		/* EJERCICIO 3: 
		 * Desarrollar un programa que permita contar cuantas vocales existentes en el
		 * siguiente parrafo. “Porta fames dis aenean platea neque semper? Conubia
		 * eleifend commodo maecenas risus risus pellentesque. Eros iaculis duis posuere
		 * integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi
		 * iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis
		 * nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet
		 * scelerisque nam maecenas elit cum.”
		 */

		String parrafo = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas\r\n"
				+ "		risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat.\r\n"
				+ "		Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie\r\n"
				+ "		euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea\r\n"
				+ "		non proin aliquet scelerisque nam maecenas elit cum.";

		contador = 0;		
		int cantVocales = 0, vocal;
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		while (contador < parrafo.length()) {

			vocal = 0;

			while (vocal < vocales.length) {

				if (vocales[vocal] == parrafo.charAt(contador)) {
					cantVocales++;
				}
				
				vocal++;
			}
			
			contador++;
		}
		
		System.out.println("El parrafo tiene " + cantVocales + " vocales");
		System.out.println();
		
		// EJERCICIO 4: 
		// Desarrollar un programa que continúe con la serie sumatoria de 11 –
		// 22 – 33 – 44. Debe mostrar únicamente los primeros 25 valores de la
		// serie.
		
		int limite = 25, numero = 11, serie= 0;
		contador = 0;
		
		
		while (contador < limite) {
			serie += numero;
			System.out.println((contador+1) + ". " + serie);
							
			contador++;
		}
		
		System.out.println();
		
		//Desarrolla un programa completamente de tu autoría y con el grado de
		//complejidad que creas necesario, utiliza todo lo aprendido hasta ahora.
		
		
		// EJERCICIO 5:
		// Escribe un programa en Java que genere y muestre los números de la serie de Fibonacci hasta que el 
		// último número generado supere un límite dado por el usuario. Además, el programa debe contar cuántos números 
		// de la serie fueron generados y mostrarlos al final.
		// La serie de Fibonacci comienza con 0 y 1, y cada número subsiguiente es la suma de los dos anteriores (0,1,1,2,3,5,8,…).
		
		int serie1 = 1, serie2 = 0;

		serie = 0;
		limite = 500;
		contador = 0;

		System.out.println("Serie Fibonacci generada con limite en " + limite);
		
		if (limite >=0) {

			if (limite == 0) {
				System.out.println(serie);
				contador++;
				
			} else if (limite >= 1 ) {
				System.out.println(serie);
				contador++;
				System.out.println(serie1);	
				contador++;
				
				serie2 = limite == 1 ? 1 : 0;
				
				while (serie2 < limite) {
					
					serie2 = serie + serie1;
					
					serie = serie1;
					serie1 = serie2;
					
					if (serie2 < limite) {
						System.out.println(serie2);
						contador++;
					}					
				}
			} 			
					
			System.out.println("Numeros generados " + contador);
			
		} else {
			System.out.println("El limite debe ser un numero positivo");
			
		}
		
		
		

	}

}
