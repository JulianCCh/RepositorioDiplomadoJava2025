package Clases;

public class Clarinete extends Instrumento{
	
	// Poliformismo: es la forma por la cual una clase que hereda puede redefinir los metodos de su clase padre
	// Anotacion por sobrescritura del metodo tocar
	@Override
	 public void tocar() {
		
		// la clase super hace referencia a superclase, implenta el metodo de la clase padre
		super.tocar();
		System.out.println("Suena el clarinete");
	 }
	 
}
