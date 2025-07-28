package Clases;

public class Perro {
	
	// Atributos de la clase
	String raza;
	String nombre;
	String encargada;
	int edad;
	

	// Constructor
	public Perro() {
		raza = "Perro";
		nombre = "Perro";
		encargada = "Daniela";		
	}
	public Perro(String raza, String nombre, String encargada, int edad) {
		this.raza = raza;		
		this.nombre = nombre;
		this.encargada = encargada;
		this.edad = edad;		
	}
	
	// Metodos de la clase
	public void Ladrar() {
		System.out.println("Hace bulla");
	}
	
	public void Pasear() {
		System.out.println("Hace sus necesidades");
	}
	
	// Metodo SETTER}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	// Metodo GETTER
	public String getNombre(){
		return nombre;				
	}
	
	// Getters y Setters de edad y encargada, generados de forma automatica
	public String getEncargada() {
		return encargada;
	}
	
	public void setEncargada(String encargada) {
		this.encargada = encargada;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public static void main (String [] args) {
		
		Perro goro = new Perro();
		
		goro.setNombre("Goro");
		goro.Ladrar();	
		System.out.println(goro.getNombre());;
	}

}
