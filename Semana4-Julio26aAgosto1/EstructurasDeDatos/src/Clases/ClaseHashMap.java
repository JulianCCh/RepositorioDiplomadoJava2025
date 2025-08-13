package Clases;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClaseHashMap {

	public static void imprimirObjeto(Map<Integer, String> objeto) {
		Set<Integer> ID = objeto.keySet();

		for (Integer integer : ID) {
			int key = integer;
			System.out.println("ID: " + key + " Nombre: " + objeto.get(key));
		}
	}

	public static void main(String args[]) {

		Map<Integer, String> personas = new HashMap<Integer, String>();

		int cantPersonas = 3;
		String name = "A";

		for (int i = 0; i < cantPersonas; i++) {

			int ID = (int) (Math.random() * 10000);

			personas.put(ID, name);

			name = name + "A";
		}
		imprimirObjeto(personas);
	}
}
