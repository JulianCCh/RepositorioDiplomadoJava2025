package Clases;

import java.util.LinkedList;
import java.util.ListIterator;

public class ClaseLinkedList {

	public static void main(String args[]) {
		// CLASE LINKEDLIST: al igual que los ArrayList no recibe datos primitivos
		// Declaracion de una LinkedList: se puede declarar el tipo de dato que desee.

		LinkedList<String> listaEnlazada = new LinkedList<String>();

		// Metodo addFirst: inserta el elemento en la posicion 0 y mueve los demas
		// elementos a la siguiente posicion

		listaEnlazada.add("Julian");
		listaEnlazada.add("Diana");
		System.out.println(listaEnlazada);
		listaEnlazada.addFirst("Valentino");
		System.out.println(listaEnlazada);

		// Metodo addLast: inserta en la posicion siguiente del ultimo elemento

		listaEnlazada.addLast("Goro");
		System.out.println(listaEnlazada);

		// Metodo getFirst getLast: devulven el primer y ultimo elemento respectivamente

		System.out.println(listaEnlazada.getFirst());
		System.out.println(listaEnlazada.getLast());

		// Metodo offer: inserta el elemento siempre en ultima posicionlo prioriza
		// ultimo moviendo los demas elementos

		listaEnlazada.offer("Daniela");
		System.out.println(listaEnlazada);
		listaEnlazada.add(4, "Isabel");
		System.out.println(listaEnlazada);

		// Metodo offerFirst: inserta el elemento en la posicion 0, lo prioriza e
		// inserta mas elementos siempre despues de este

		listaEnlazada.offerFirst("Alberto");
		System.out.println(listaEnlazada);
		listaEnlazada.add(1, "Ana");

		// Metodo peek: trae el primer elemento

		System.out.println(listaEnlazada.peek());

		// Metodo peekLast : trae el ultimo elemento

		System.out.println(listaEnlazada.peekLast());

		// Metodo poll: Elimina el primer elemento

		listaEnlazada.poll();
		System.out.println(listaEnlazada);

		// Metodo pollLast: Elimina el ultimo elemento

		listaEnlazada.pollLast();
		System.out.println(listaEnlazada);

		// Metodo pop: trae y elimina el primer elemento

		System.out.println(listaEnlazada.pop());

		// Metodo push: inserta en la posicion 0, modifica el indice de los demas
		// elementos

		listaEnlazada.push("Eva");
		System.out.println(listaEnlazada);

		// Metodo ListIterator: crea una variable de iteracion de listas

		ListIterator<String> iteradorEnlazada = listaEnlazada.listIterator();

		while (iteradorEnlazada.hasNext()) {
			System.out.println("Valor posicion " + iteradorEnlazada.nextIndex() + ": " + iteradorEnlazada.next());

		}
	}

}
