package EjercicioAgendaTelefonica;

public class contacto {
	
	private String nombre;
	private long numContacto;
	
	public contacto() {
		
	}
	
	public contacto(String nombre, long numContacto) {
		this.nombre=nombre;
		this.numContacto=numContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getNumContacto() {
		return numContacto;
	}

	public void setNumContacto(long numContacto) {
		this.numContacto = numContacto;
	}

}
