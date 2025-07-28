package Clases;

public class Persona {
	
	//Atributos de la clase persona
	
	String nombre;
	String pais;
	int edad;
	
	// Constructor de la clase persona	
	public Persona() {				
	}
	
	// Metodo de la clase persona
	public void Saludar() {
		System.out.println("Hola");
	}
	
	public void Cantar() {
		System.out.println("Se canta un temita");
	}
	
	public void Comer() {
		System.out.println("Pide un domicilio");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Implementacion de la clase por medio de la clase Main
	public static void main (String [] args) {
		Persona Julian = new Persona();
		System.out.println(Julian);
		Julian.Saludar();
	}
}
