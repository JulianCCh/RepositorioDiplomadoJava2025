package Clases;

import java.util.Stack;

public class ClaseStack {
	
	public static void main(String args[]) {
		
		// CLASE STACK: es una estructura de datos lineal que solo tiene un único punto de acceso fijo por el
		//              cual se añaden, eliminan o se consultan elementos. Metodo de acceso LIFO(ultimo en entrar, primero en salir)
		
		// Declaracion de una pila.
		
		Stack<String> pilaString = new Stack<String>();
		Stack<Integer> pilaInteger = new Stack<Integer>();
		Stack<Double> pilaDouble = new Stack<Double>();
		Stack<Object> pilaObject = new Stack<Object>();
		Stack<Usuario> pilaClase = new Stack<Usuario>();
		Stack pilaSinTipo = new Stack();
		
		//Metodo Push: inserta elemento al principio de la pila
		
		pilaString.push("Lenovo");
		pilaString.push("Asus");
		pilaString.push("Samsung");
		
		// Metodo pop: Devuelve el primer elemento y lo elimina
		
		System.out.println(pilaString);
		System.out.println(pilaString.pop());
		System.out.println(pilaString);
		
		// Metodo peek: devuelve el primer elemento
		
		System.out.println(pilaString.peek());

		// Metodo empty: verifica si la lista esta vacia, devuelve true o false
		
		System.out.println("La pila esta vacia: "+pilaString.empty());
		
		// Metodo search: determina si existe un dato en la pila, devulve su posicion o -1 sino lo encuentra
		
		System.out.println(pilaString.search("Asus"));
		System.out.println(pilaString.search("Lenovo"));
		System.out.println(pilaString.search("Samsung"));
		
		// Metodo recorre pila
		
		pilaString.push("Mac");
		
		do { 
			System.out.println(pilaString.peek());			
		} while (pilaString.pop() != null && !pilaString.empty());
		
		
	}

}
