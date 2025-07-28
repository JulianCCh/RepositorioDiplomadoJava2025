package Clases;

public class Casa {
	
	private String color, ciudad, propietario;
	private int habitantes, cuartos, precio;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public int getCuartos() {
		return cuartos;
	}

	public void setCuartos(int cuartos) {
		this.cuartos = cuartos;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}	

	public Casa() {		
	}

	public void pintarDeBlanco() {
		color = "blanco";
	}
	
	public void cambiarPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public void mostrarCiudad() {
		System.out.println("La casa se encuentra en: " + ciudad);
	}
	
	public int aumentarPrecio(int precio) {
		return this.precio += precio;
	}
	
	public int habitacionesPorHabitantes() {
		return cuartos/habitantes;
	}
	
	public int valorMiCasa() {
		return precio;
	}
	
	public static void main (String [] args) {
	
		Casa miCasa = new Casa();
		
		miCasa.setColor("verde");
		System.out.println(miCasa.getColor());
		miCasa.pintarDeBlanco();
		System.out.println(miCasa.getColor());
		
		miCasa.setPropietario("Julian");
		System.out.println(miCasa.getPropietario());
		miCasa.cambiarPropietario("Diana");
		System.out.println(miCasa.getPropietario());
		
		miCasa.setCiudad("Cali");
		miCasa.mostrarCiudad();
		
		miCasa.aumentarPrecio(6000);
		System.out.println(miCasa.getPrecio());
		miCasa.aumentarPrecio(9000);
		System.out.println(miCasa.getPrecio());
		
		miCasa.setCuartos(4);
		miCasa.setHabitantes(2);
		System.out.println(miCasa.habitacionesPorHabitantes());
		System.out.println("El valor de mi casa es: " + miCasa.valorMiCasa());
		
		
		
	}
}
