package EjerciciosModulo2;

import java.util.Scanner;

public class EjerciciosSwitch {
	public static void main (String args[]) {
		/* EJERCICIO 1:
		 * 1. Desarrolla un programa donde por medio del tipo de un motor, determinar
		 * qué tipo de fluido puede trasportar éste según las siguientes condiciones: 
		 * -Si el tipo de motor es 0, mostrar un mensaje por consola indicando “No hay
		 * establecido un valor definido para el tipo”. 
		 * - Si el tipo de motor es 1, mostrar un mensaje por consola indicando “Agua”. 
		 * - Si el tipo de motor es 2, mostrar un mensaje por consola indicando “Gasolina”. 
		 * - Si el tipo de motor es 3, mostrar un mensaje por consola indicando “Hormigón”. 
		 * - Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido”.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int tipo = 4;
		
		while (tipo > 3) {
			
			System.out.println("Para conocer que tipo de fluido pude transportar el vehiculo \n"
					+ "ingrese el numero del tipo de motor:");
			tipo = scanner.nextInt();

			switch (tipo) {
			case 0:
				System.out.println("No hay establecido un valor definido para el tipo");
				break;
			case 1:
				System.out.println("Agua");
				break;
			case 2:
				System.out.println("Gasolina");
				break;
			case 3:
				System.out.println("Hormigon");
				break;
			default:
				System.out.println("Valor invalido");				
				break;
			}			
		}
		/* EJERCICIO 2: 
		 * Desarrollar una calculadora, la cual, en base a un operador,
		 * realice una operación con dos números enteros ya definidos y mostrar el
		 * resultado, los operadores a tener en cuenta son los vistos en la tabla de
		 * operadores aritméticos, sí deseas agregar más operadores, siéntete en
		 * libertad de hacerlo.
		 */
		
		int numero1 = 45, numero2 = 64, resultado = 0;	
		
		String operador;
		System.out.println("Digite el signo del operador para los numero1 y numero2 (+, -, *, /):");
		scanner = new Scanner(System.in);
		operador = scanner.nextLine().toUpperCase();
		boolean mostrar = true;
		
		switch (operador) {
		case "+":
			resultado = numero1 + numero2;
			break;
		case "-":
			 resultado = numero1 - numero2;
			break;
		case "*":
			resultado = numero1 * numero2;
			break;
		case "/":
			if (numero2!=0) {
				resultado = numero1 / numero2;				
			} else {
				System.out.println("No es posible dividir por cero");				
			}
			break;
		default:
			System.out.println("Operador sin asignacion");
			mostrar = false;			
			break;
		}
		if (mostrar) {
			System.out.println("Operador selescionado: " + operador + ". El resultado de la opacion entre " + numero1 + " y " + numero2 + ": "+ resultado);			
			
		}
	}	
}
