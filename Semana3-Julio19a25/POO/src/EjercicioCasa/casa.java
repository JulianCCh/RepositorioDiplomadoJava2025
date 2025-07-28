package EjercicioCasa;

/*Clase casa, cuenta con siete atributos: ciudad, barrio, color, 
     pisos, habitaciones, baños y cocinas, se deben inicializar todos los
     atributos dentro de la clase, de forma que serán atributos
     CONSTANTES y sólo se crearán los Getters.*/

public class casa {
	
	private String ciudad, barrio, color;
	private int pisos, habitaciones, baños, cocinas;
	
	// Constructor con constantes
	public casa() {
		ciudad = "Cali";
		barrio = "San pedro";
		color = "Azul";
		pisos = 2;
		habitaciones = 12;
		baños = 13;
		cocinas = 1;
	}
	
	// Constructor ciudad-barrio-color
	public casa (String ciudad, String barrio, String color) {
		this.ciudad = ciudad;
		this.barrio = barrio;
		this.color = color;
	}
	
	// Constructor barrio-color-pisos
	public casa(String barrio, String color, int pisos) {
		this.barrio = barrio;
		this.color = color;
		this.pisos = pisos;
	}
	
	// Constructor pisos-habitaciones-baños-cocinas
	public casa(int pisos, int habitaciones, int baños, int cocinas) {
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.baños = baños;
		this.cocinas = cocinas;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public void setBaños(int baños) {
		this.baños = baños;
	}

	public void setCocinas(int cocinas) {
		this.cocinas = cocinas;
	}

	public String getCiudad() {
		return ciudad;
	}
	public String getBarrio() {
		return barrio;
	}
	public String getColor() {
		return color;
	}
	public int getPisos() {
		return pisos;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public int getBaños() {
		return baños;
	}
	public int getCocinas() {
		return cocinas;
	}
	

}
