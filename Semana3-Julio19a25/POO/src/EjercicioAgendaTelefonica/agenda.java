package EjercicioAgendaTelefonica;

public class agenda {
	
	private contacto[] contactos = new contacto[10];
	
	public agenda() {}
	
	public agenda(contacto[] contactos) {
		for (int i = 0; i < contactos.length; i++) {
			this.contactos[i]=contactos[i];			
		}
	}
	
	public boolean registrarContacto(contacto contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {				
				contactos[i] = contacto;
				//System.out.println("Contacto registrado en posicion "+i);
				return true;
			}
		}
		return true;
	}
	
	public void listarContactos() {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null) {
				
				System.out.println(contactos[i].getNombre() + ": "+ contactos[i].getNumContacto());			
			}
		}
	}
	
	public void buscarContacto(String nombre) {
		
		for (int i = 0; i < contactos.length; i++) {
			
			if (contactos[i]!= null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Numero del contacto "+ nombre +": "+ contactos[i].getNumContacto());
			}
		}		
	}
	
	public void disponibles() {
		System.out.println("Posiciones disponibles en la agenda:");
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				System.out.println(i);				
			}
		}
	}
	

}
