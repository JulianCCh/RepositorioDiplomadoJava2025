package EjercicioCiudad;

/* Crear un proyecto llamado EjercicioCiudad que permita almacenar la 
   información de una ciudad, para esto se deberán crear dos clases: 
   ciudad y la clase principal para ejecutar.
   - Clase ciudad, cuenta con cuatro atributos: nombre, población, país,
     presidente, además de los Getters y Setters con los constructores que
     creas necesarios.
   - Inicializar los atributos por medio de los Setters.
   - En la clase principal mostrar los datos almacenados de la ciudad por medio de los getters
*/

public class main {
	
	public static void main (String args[]) {
		
		ciudad cali = new ciudad();
		
		cali.setNombre("Cali");
		cali.setPais("Colombia");
		cali.setAlcalde("Fachin");
		cali.setPoblacion(2000000);
		
		System.out.println("Nombre:" + cali.getNombre());
		System.out.println("Pais:" + cali.getPais());
		System.out.println("Alcalde:" + cali.getAlcalde());
		System.out.println("Poblacion:" + cali.getPoblacion());
		
	}

}
