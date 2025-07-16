package estructuras;

import java.util.Scanner;

public class Condiciones {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		// Estructura if-else-else if
		int numero;
		
		System.out.println("Ingrese un numero:");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Este es un numero es par");			
		} else {
			System.out.println("este numero es impar");			
		}
		
		/*En Colombia hay medidas que regulan la velocidad de los automoviles según
		las zonas donde se encuentre:
		• 30 km/h – zonas escolares
		• 60 km/h – vías urbanas
		• 80 km/h – vías rurales
		• 100 km/h – rutas nacionales
		Realiza un algoritmo que permita determinar, según una velocidad X, a qué
		grupo de límites pertenezco y si estoy infringiendo los límites de velocidad.*/		
		
		double velocidad;
		
		System.out.println("Ingrese la velocidad:");
		scanner = new Scanner(System.in);
		velocidad = scanner.nextDouble();
		
		if (velocidad > 0 ) {
			if (velocidad > 0 && velocidad <= 30) {
				System.out.println("Esta en una zona escolar");
			} else if (velocidad > 30 && velocidad <= 60) {
				System.out.println("Esta en una via urbana");
			}else if (velocidad > 60 && velocidad <= 80) {
				System.out.println("Esta en una via rural");
			}else if (velocidad > 80 && velocidad <= 100) {
				System.out.println("Esta en una ruta nacional");
			}else {
				System.out.println("Esta sobrepasando el limite de velocidad permitido");
			}
			
		} else {
			System.out.println("la velocidad debe ser un valor positivo diferente de 0");
		}
		
		//Estructura switch
		
		if (numero> 0 && numero<=5) {
			switch (numero) {
			case 1:
				System.out.println("Numero 1");
				break;
			case 2:
				System.out.println("Numero 2");
				break;
			case 3:
				System.out.println("Numero 3");
				break;
			case 4:
				System.out.println("Numero 4");
				break;
			case 5:
				System.out.println("Numero 5");
				break;
			default:
				break;
			}			
		} else {
			System.out.println("Para ejecutar la estructura switch ingrese un numero entre 1 y 5");
		}
		
		// break y continue. 
		// break rompe el ciclo de ejecucion y continua con la siguiente linea de instruciones
		// continie imterrumpe la iteracion y continua con el resto del ciclo de ejecucion		
		
		// Con la ejecucion de un ciclo for se evidencia como trabaja cada instruccion
		
		for (int i = 0; i < 5; i++) {
			System.out.println("dentro del ciclo");	
			break;
		}
		System.out.println("fuera del ciclo");
		
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("dentro del ciclo");			
		}
		
		// Omision del break. Esta declacion es opcional
		// Ejem´plo: determinar en un switch los dias laborales de la semana
		
		System.out.println("Ingrese el numero del dia de la semana");
		scanner = new Scanner(System.in);
		int dia = scanner.nextInt();
		
		if (dia > 0 && dia <= 7) {
			switch (dia) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Dia laboral");
				break;
			case 6:
			case 7:
				System.out.println("Fin de semana");
			default:
				break;
			}			
			
		} else {
			System.out.println("El numero no es valido");
		}
		
	}	
	
}
