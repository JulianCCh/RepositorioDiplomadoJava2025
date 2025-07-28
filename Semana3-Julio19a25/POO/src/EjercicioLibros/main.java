package EjercicioLibros;

/* Crear un proyecto llamado Libros que permita almacenar la información
   de un libro, para esto se deberán crear dos clases: libro y la clase
   principal para ejecutar.
   
   - Clase libro, cuenta con tres atributos: autor, título y páginas, además
     de los Getters y Setters con los constructores que creas necesarios, y
     los siguientes métodos.
   - mostrarLibro(), muestra la información del libro en el siguiente
     formado: “El libro TITULO, del autor AUTOR, tiene PAGINAS páginas”,
     por ejemplo: “El libro Cien años de soledad, del autor Gabriel Garcia
     Marquez, tiene 482 páginas”.
   - compararLibros(), recibe el número de páginas de dos libros, y
     muestra el título del libro con mayor páginas.
   - En la clase principal realizar todos los procesos anteriormente
     diseñados por los métodos y mostrar los resultados.*/

public class main {
	
	public static void main (String args []) {
		
		libro libro1 = new libro("La mafia roba perros","no me acuerdo",4685);
		libro libro2 = new libro("El principe","maquiavelo",300);
		
		libro1.mostrarLibro();
		libro2.mostrarLibro();
		
		System.out.println(libro1.compararLibros(libro1, libro2));
	}

}
