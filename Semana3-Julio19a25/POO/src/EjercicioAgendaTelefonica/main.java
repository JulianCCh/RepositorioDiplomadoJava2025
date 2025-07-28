package EjercicioAgendaTelefonica;

/* Crear un proyecto llamado AgendaTelefonica que permita simular una
   agenda de contactos, para esto se deberán crear tres clases: contacto,
   agenda y la clase principal para ejecutar ambas:
   
   - Clase contacto, cuenta con dos atributos: nombre y número,
     además de los métodos Getters y Setters y los constructores que
     creas necesarios.
   - Clase agenda, cuenta con un atributo, un vector de tipo contacto
     inicializado en 10, con los siguientes métodos:
   - registrarContacto(), recibe un objeto de tipo contacto.
   - listarContactos(), lista toda la agenda.
   - buscarContacto(), recibe el nombre del contacto que desea
     buscar y muestra el teléfono.
   - disponibles(), muestra los contactos disponibles para registrar.
   - En la clase principal realizar todos los procesos anteriormente
     diseñados por los métodos y mostrar los resultados.*/

public class main {
	public static void main(String args[]) {

		// Instancias de la clase contacto, con el constructor con parametros
		contacto julian = new contacto("Julian", 3117766630l), contacto4 = new contacto("contacto4", 3045678956l);
		
		// Vector de la clase contacto, para construir el objeto agenda con el constructor con parametro
		contacto[] familia = { new contacto("Valentino",3027013106l), new contacto("Diana",3155343441l)};
		
		//Instancia de la clase agenda, con el constructor con parametro
		agenda listaContactos = new agenda(familia);
		
		//Metodo registrar
		listaContactos.registrarContacto(julian);		
		listaContactos.registrarContacto(contacto4);
		
		listaContactos.listarContactos();
		
		listaContactos.buscarContacto("Valentino");
		
		listaContactos.disponibles();
		
	}

}
