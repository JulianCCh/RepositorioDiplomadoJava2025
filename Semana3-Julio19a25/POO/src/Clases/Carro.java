package Clases;

public class Carro {
	String marca, color, modelo;
	boolean enVenta;
	
	// Parametros: son los datos que necesita el metodo para funcionar, se usa en la declaracion del metodo
	//			   Tambien se pueden definir como los valores que un metodo recibe desde un objeto.
	public Carro(String marca, String color, String modelo, boolean enVenta) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.enVenta = enVenta;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}

	public static void main (String args[]) {
		
		// Argumentos: son los datos que recibe un objeto para operar un metodo. 
		Carro todoTerreno = new Carro("renault", "negro", "duster", true);
		
		System.out.println(todoTerreno.marca);
		System.out.println(todoTerreno.modelo);
		System.out.println(todoTerreno.color);
		System.out.println(todoTerreno.enVenta);
		
	}
}
