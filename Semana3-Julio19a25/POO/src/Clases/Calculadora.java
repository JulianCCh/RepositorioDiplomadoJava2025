package Clases;

public class Calculadora {
	
	private int numero1, numero2;
	private String operador;
	
	public Calculadora(int numero1, int numero2, String operador) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operador = operador;
	}
	
	// Constructor vacio
	public Calculadora() {
		
	}
	
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	// Paso por valor: Se hace uso de datos en su valor primitivo, esto quiere deci el valor directamente
	public int Suma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	// Paso por referencia: Se usan datos de tipo objeto, arreglos entre otros. se llama por referencia por contener la direccion 
	//                      en momoria del valor, no diectamente una copia del valor
	public int sumarVector (int [] vector) {
		int suma = 0;
		for (int i = 0; i < vector.length; i++) {
			suma += vector[i];
		}
		return suma;
	}
	
	public String operacio() {
		return this.getNumero1()+ " " + this.getOperador() + " " + this.getNumero2();
	}
	
	public static void main (String args []) {
		
		Calculadora operaciones = new Calculadora();
		int resultado = operaciones.Suma(8,5);
		
		int[] numeros = {1,2,3,4,5,6};
		System.out.println(resultado);
		
		resultado = operaciones.sumarVector(numeros);
		System.out.println(resultado);
		
		Calculadora operaciones2 = new Calculadora(8, 9, "+");
		
		// Operador3: objeto declarado para usar el constructor vacio
		Calculadora operaciones3 = new Calculadora();
		operaciones3.setNumero1(4);
		operaciones3.setNumero2(5);
		operaciones3.setOperador("/");
		System.out.println(operaciones3.operacio());
	}

}
