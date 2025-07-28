package Clases;

public class circunferencia {
	
	// static: define los elementos que pertecen a la clase, en lugar de pertenecer a un objeto particular
	//         permite usar el elemento defino sin necesidad de instanciar la clase en un objeto
	private static float pi = (float) Math.PI;
	private float radio = 0f;
	
	public circunferencia(float radio) {
		this.radio = radio;
	}
	
	// Metodo area no Static
	public float area() {
		return (pi*radio*radio);
	}
	
	// metodo area de tipo static
	public static float area(float radio) {
		return (pi*radio*radio);
	}
	
	// Metodo Static: este hace uso unicamente de los atributos static
	
	 public static void main(String args[]) {
		 
		 // Implementacion de elemento con atributo static
		 System.out.println(circunferencia.pi);	
		 
		 // Implamentacion del metodo con atributo static, no hay que instanciar la clase. 
		 System.out.println(circunferencia.area(45f));
		 
		 //implementacion del metodo no static, hay que instanciar la clase y se usan los atributos del objeto
		 circunferencia circulo = new circunferencia(45f);
		 System.out.println(circulo.area());
		 
		 
	 }

}
