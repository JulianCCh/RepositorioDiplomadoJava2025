package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ClaseList {
	
	public static void main (String args[]) {
		
		// CLASE LIST
		// Declaracion de una lista 
		
		List<String> listaNombres = new ArrayList<String>();

		List<Integer> listaInt = new ArrayList<Integer>();
		
		List<Double> listaDouble = new ArrayList<Double>();
		
		List<Object> listaObject = new ArrayList<Object>();	
		
		List<Usuario> listaClase= new ArrayList<Usuario>();
		
		List listaSinTipo= new ArrayList<>();
		
		List<String> listaTamañoDefinido= new ArrayList<String>(10);		
		
		// Agregar elementos
		
		// Metodo add: se puede usar cuantas veces se necesite pues no hay limite de elementos en la lista
		
		listaNombres.add("Colombia");
		listaNombres.add("Argentina");
		listaNombres.add("Chile");
		
		// add con indice: no puede existir datos en la posicion ha acceder.
		
		listaNombres.add(3, "Venezuela");
		listaNombres.add(4, "Peru");
		listaNombres.add(5, "Brazil");
		
		// add list(addAll): las listas deben ser el mismo tipo
		
		List<String> listaNueva = new ArrayList<String>();
		
		listaNueva.add("Alemania");
		listaNueva.add("Grecia");
		listaNueva.add("Italia");
		
		listaTamañoDefinido.add("España");
		listaTamañoDefinido.add("Francia");
		listaTamañoDefinido.add("Suiza");
		
		listaTamañoDefinido.addAll(listaNueva);
		System.out.println(listaTamañoDefinido);
		System.out.println(listaNombres);
		
		/* Metodo set: actualiza un índice de la lista a partir de una posición y un valor del mismo tipo determinado. 
		             No se pueden actualizar posiciones no existentes.*/
		
		listaNombres.set(1, "Uruguay");
		System.out.println(listaNombres);
		
		// Metodo get: recupera el valor en una posicion determinada
		
		String nombre = listaNombres.get(0);
		System.out.println(nombre);
		
		// Metodo size: determina el tamaño de la lista segun su contenido
		
		int largoLista = listaNombres.size();
		System.out.println(largoLista);
		
		// Metodo contains: evalua si el valor que recibe existe en lista, devulve true o false
		
		System.out.println("Uruguay esta en la lista?: " + listaNombres.contains("Uruguay"));
		
		if (listaNombres.contains("Colombia")) {
			System.out.println("Mi país");			
		}
		
		// Metodo clear: limpia todos los campos de la lista
		
		System.out.println("Tamaño listaNombres poblada: " + listaNombres.size());	
		
		listaNombres.clear();
		
		System.out.println("Tamaño listaNombres despues del clear(): " + listaNombres.size());	
		
		// Metodo isEmpty: retorna verdadero o falso si la lista tiene elementos o no.
		
		if (listaNombres.isEmpty()) {
			System.out.println("lista vacia");			
		}
		else {
			System.out.println("lista con elementos");			
		}
		
		// Metodo remove: indicando un indice existente en la lista de remueve ese elelemto
		
		
		System.out.println("Antes de remove: "+listaTamañoDefinido);
		listaTamañoDefinido.remove(0);
		System.out.println("Despues de remove: "+listaTamañoDefinido);
		
		// Metodo remove por valor: se indica un valory se elimina el primero que se encuentre
		//                          este metodo retorna un valor booleano
		
		System.out.println("Antes de remove: "+listaTamañoDefinido);
		
		if (listaTamañoDefinido.remove("Francia")) {
			System.out.println("Elemento eliminado");			
		} 
		else {
			System.out.println("Elemento no econtrado en la lista");			
		}
				
		System.out.println("Despues de remove: "+listaTamañoDefinido);
		
		// Metodo indezOf: Devuelve el indice del elemento si este existe en la lista
		
		int posicion = listaTamañoDefinido.indexOf("Italia");
		System.out.println("Italia esta en la posicion " + posicion);
		
		// Metodo Iterator: crea una variable iteradora que recorre la lista
		
		Iterator<String> listaIterable = listaTamañoDefinido.iterator();
		
		while (listaIterable.hasNext()) {	
			System.out.println("Valor: " + listaIterable.next());
			
		}
		
			
		
		
		
	}

}
