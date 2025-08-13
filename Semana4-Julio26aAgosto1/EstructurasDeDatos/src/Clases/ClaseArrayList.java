package Clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseArrayList {
	public static void main(String args[]) {
		// CLASE ARRAYLIST: esta clase no recibe atriburtos primitivos
		// Declaracion de un ArrayList

		ArrayList<Integer> Array = new ArrayList<Integer>();

		// ArrayList de cadenas

		ArrayList<String> ArrayString = new ArrayList<String>();

		// ArrayList de Double

		ArrayList<Double> ArrayDouble = new ArrayList<Double>();

		// ArrayList de Objetos
		ArrayList<Object> ArrayObject = new ArrayList<Object>();

		// ArrayList de tipo clase
		ArrayList<Usuario> ArrayClase = new ArrayList<Usuario>();

		// ArrayList sin tipo especifico
		ArrayList ArraySinTipo = new ArrayList();
		
		// Los metodos de la Clase List se aplican a esta clase
		
		// Agregar elementos
		
				// Metodo add: se puede usar cuantas veces se necesite pues no hay limite de elementos en la lista
				
				ArrayString.add("Colombia");
				ArrayString.add("Argentina");
				ArrayString.add("Chile");
				
				// add con indice: no puede existir datos en la posicion ha acceder.
				
				ArrayString.add(3, "Venezuela");
				ArrayString.add(4, "Peru");
				ArrayString.add(5, "Brazil");
				
				// add list(addAll): las listas deben ser el mismo tipo
				
				ArrayList<String> ArrayNuevo = new ArrayList<String>();
				ArrayList<String> ArrayNuevo2 = new ArrayList<String>();
				
				ArrayNuevo.add("Alemania");
				ArrayNuevo.add("Grecia");
				ArrayNuevo.add("Italia");
				
				ArrayNuevo2.add("España");
				ArrayNuevo2.add("Francia");
				ArrayNuevo2.add("Suiza");
				
				ArrayNuevo2.addAll(ArrayNuevo);
				System.out.println(ArrayNuevo2);
				System.out.println(ArrayString);
				
				/* Metodo set: actualiza un índice de la lista a partir de una posición y un valor del mismo tipo determinado. 
				             No se pueden actualizar posiciones no existentes.*/
				
				ArrayString.set(1, "Uruguay");
				System.out.println(ArrayString);
				
				// Metodo get: recupera el valor en una posicion determinada
				
				String nombre = ArrayString.get(0);
				System.out.println(nombre);
				
				// Metodo size: determina el tamaño de la lista segun su contenido
				
				int largoLista = ArrayString.size();
				System.out.println(largoLista);
				
				// Metodo contains: evalua si el valor que recibe existe en lista, devulve true o false
				
				System.out.println("Uruguay esta en la lista?: " + ArrayString.contains("Uruguay"));
				
				if (ArrayString.contains("Colombia")) {
					System.out.println("Mi país");			
				}
				
				// Metodo clear: limpia todos los campos de la lista
				
				System.out.println("Tamaño ArrayString poblada: " + ArrayString.size());	
				
				ArrayString.clear();
				
				System.out.println("Tamaño ArrayString despues del clear(): " + ArrayString.size());	
				
				// Metodo isEmpty: retorna verdadero o falso si la lista tiene elementos o no.
				
				if (ArrayString.isEmpty()) {
					System.out.println("lista vacia");			
				}
				else {
					System.out.println("lista con elementos");			
				}
				
				// Metodo remove: indicando un indice existente en la lista de remueve ese elelemto
				
				
				System.out.println("Antes de remove: "+ArrayNuevo2);
				ArrayNuevo2.remove(0);
				System.out.println("Despues de remove: "+ArrayNuevo2);
				
				// Metodo remove por valor: se indica un valory se elimina el primero que se encuentre
				//                          este metodo retorna un valor booleano
				
				System.out.println("Antes de remove: "+ArrayNuevo2);
				
				if (ArrayNuevo2.remove("Francia")) {
					System.out.println("Elemento eliminado");			
				} 
				else {
					System.out.println("Elemento no econtrado en la lista");			
				}
						
				System.out.println("Despues de remove: "+ArrayNuevo2);
				
				// Metodo indezOf: Devuelve el indice del elemento si este existe en la lista
				
				int posicion = ArrayNuevo2.indexOf("Italia");
				System.out.println("Italia esta en la posicion " + posicion);
				
				// Metodo Iterator: crea una variable iteradora que recorre la lista
				
				Iterator<String> ArrayIterable = ArrayNuevo2.iterator();
				
				while (ArrayIterable.hasNext()) {	
					System.out.println("Valor: " + ArrayIterable.next());
					
				}
		
	}
	
	
	

}
