package Clases;

public class Vehiculo {
	
	private String matricula, modelo;
	private int potencia;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	public void encender() {
		System.out.println("Se encendio el vehiculo");
	}
	public void apagar() {
		System.out.println("Se apago el vehiculo");
	}
	

}
