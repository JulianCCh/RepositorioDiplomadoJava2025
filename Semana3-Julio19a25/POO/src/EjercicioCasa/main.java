package EjercicioCasa;

/* Crear un proyecto llamado Casa que permita simular la información
   básica sobre una casa, para esto se deberán crear dos clases: 
   casa y la clase principal para ejecutar:
   
   - Clase casa, cuenta con siete atributos: ciudad, barrio, color, 
     pisos, habitaciones, baños y cocinas, se deben inicializar todos los
     atributos dentro de la clase, de forma que serán atributos
     CONSTANTES y sólo se crearán los Getters.
   - En la clase principal mostrar la información de la casa por medio
     de los getters.
     
   Replique el ejercicio anterior y por medio constructores inicializar los
   atributos:
   
   - Primer constructor: recibe: la ciudad, el barrio y el color.
   - Segundo constructor: recibe: el barrio, el color y los pisos.
   - Tercer constructor: recibe: los pisos, las habitaciones, los baños y
     las cocinas.
   - En la clase principal mostrar la información de la casa generada
     por cada constructor por medio de los getters, para esto deberás
     crear 3 objetos diferentes en la clase principal para representar
     cada constructor.
     */

public class main {
	public static void main(String args[]) {

		casa miCasa = new casa();

		System.out.println("Informacion de casaConstante");
		System.out.println();
		System.out.println("Ubicacion: Ciudad: " + miCasa.getCiudad() + ", Barrio: " + miCasa.getBarrio());
		System.out.println("Pintura: " + miCasa.getColor());
		System.out.println("Pisos: " + miCasa.getPisos());
		System.out.println("Habitaciones: " + miCasa.getHabitaciones());
		System.out.println("Baños: " + miCasa.getBaños());
		System.out.println("Cocinas: " + miCasa.getCocinas());

		casa casa1 = new casa("Cali", "Guaduales", "Blanca");

		System.out.println("Informacion de casa1");
		System.out.println();
		System.out.println("Ubicacion: Ciudad: " + casa1.getCiudad() + ", Barrio: " + casa1.getBarrio());
		System.out.println("Pintura: " + casa1.getColor());
		System.out.println("Pisos: " + casa1.getPisos());
		System.out.println("Habitaciones: " + casa1.getHabitaciones());
		System.out.println("Baños: " + casa1.getBaños());
		System.out.println("Cocinas: " + casa1.getCocinas());

		casa casa2 = new casa("Centro", "ladrillo", 10);

		System.out.println("Informacion de casa2");
		System.out.println();
		System.out.println("Ubicacion: Ciudad: " + casa2.getCiudad() + ", Barrio: " + casa2.getBarrio());
		System.out.println("Pintura: " + casa2.getColor());
		System.out.println("Pisos: " + casa2.getPisos());
		System.out.println("Habitaciones: " + casa2.getHabitaciones());
		System.out.println("Baños: " + casa2.getBaños());
		System.out.println("Cocinas: " + casa2.getCocinas());

		casa casa3 = new casa(2, 3, 3, 1);

		System.out.println("Informacion de casa3");
		System.out.println();
		System.out.println("Ubicacion: Ciudad: " + casa3.getCiudad() + ", Barrio: " + casa3.getBarrio());
		System.out.println("Pintura: " + casa3.getColor());
		System.out.println("Pisos: " + casa3.getPisos());
		System.out.println("Habitaciones: " + casa3.getHabitaciones());
		System.out.println("Baños: " + casa3.getBaños());
		System.out.println("Cocinas: " + casa3.getCocinas());
		
		
	}

}
