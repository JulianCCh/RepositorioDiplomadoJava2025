package Clases;

public class Usuario {
	
	public String usuario;

	public Usuario(String usuario) {
		this.usuario = usuario;
	}
	
	public void establecerRoles() {
		Administrador admin = new Administrador();
		admin.trabajar();
	}
	
	public class Administrador{
		public void trabajar() {
			System.out.println("El administrador "+ usuario +" esta trabajando");
		}
	}
	
	
	

}
