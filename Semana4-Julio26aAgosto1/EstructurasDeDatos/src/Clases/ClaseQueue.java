package Clases;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ClaseQueue {
	
	public static void main(String args[]) {
		
		/* CLASE QUEUE: la operación de inserción push se realiza por un extremo y la operación 
		                de extracción pop se realiza por el otro. Metodo de acceso FIFO
		                (primer elemento en entrar será también el primero en salir)*/
		
		// Declaracion de una cola
		
		Queue<Integer> colaInteger = new LinkedList<Integer>();
		
		// Metodo add: inserta elemento en la cola
		
		colaInteger.add(3);
		colaInteger.add(6);
		colaInteger.add(9);
		colaInteger.add(12);
		System.out.println(colaInteger);
		
		// Metodo element: devuelve el primer elemento de la cola
		
		System.out.println("Primer elemento: "+colaInteger.element());
		
		// Metodo offer: prioriza el elemento y lo mantiene en la ultima posicion
		
		colaInteger.offer(27);
		colaInteger.offer(30);
		System.out.println(colaInteger);
		
		// Metodo peek: retorna el primer elemento y devuvlve null si la cola esta vaica
		
		System.out.println("Primer elemento: "+colaInteger.peek());
		
		// _Metodo poll: retorna y elimina el primer elemento
		
		colaInteger.poll();
		System.out.println(colaInteger);
		
		// Metodo remove: Elimina y retorna el primer elemento
		
		System.out.println("Elemento eliminado: "+colaInteger.remove());
		System.out.println(colaInteger);
		
		// Metodo iterador: recorre la cola
		
		Iterator<Integer> colaIterable = colaInteger.iterator();
		
		while (colaIterable.hasNext()) {
			System.out.println("Valor: "+colaIterable.next());
			
		}
		
		
	}

}
