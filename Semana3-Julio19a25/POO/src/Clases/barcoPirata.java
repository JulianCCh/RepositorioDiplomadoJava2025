package Clases;

// Clase para implementar la interfz Barco
public class barcoPirata implements Barco {
	
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public void conocerPosicion() {
		System.out.println("Posicion actual " + x + " - " + y);
	}
	
	// Se defienen los metodos declarados en la interfaz que deben ser heredados
	@Override
	public void moverPosicion(int x, int y) {
		this.x -= x;
		this.y -= y;		
	}

	@Override
	public void disparar() {
		System.out.println("Disparar cañones");
		
	}
	
}
