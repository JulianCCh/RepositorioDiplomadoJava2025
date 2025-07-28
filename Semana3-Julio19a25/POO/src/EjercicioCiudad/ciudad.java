package EjercicioCiudad;

/*Clase ciudad, cuenta con cuatro atributos: nombre, población, país,
     presidente, además de los Getters y Setters con los constructores que
     creas necesarios.*/

public class ciudad {
	
	private String nombre, pais, alcalde;
	private long poblacion;
	
	//Constructor
	public ciudad() {
		
	}
	
	//Getter y Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getAlcalde() {
		return alcalde;
	}

	public void setAlcalde(String alcalde) {
		this.alcalde = alcalde;
	}

	public long getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}
}
