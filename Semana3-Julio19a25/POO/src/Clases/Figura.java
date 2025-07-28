package Clases;

// Clase Abstracta: No se pueden crear objetos a partir de esta clase, se implementa a partir de clases heredadas
//                  los metodos abstractos no se implementan en la super clase, se implemente ne una clase hija
public abstract class Figura {
	
	private String color;

	public Figura(String color) {
		this.color = color;
	}
	
	public abstract double calcularArea();
	
	public String getColor() {
		return color;
	}
	

}
