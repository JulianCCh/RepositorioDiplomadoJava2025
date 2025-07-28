package Clases;

public class main {
	public static void main (String args[]) {
		
		// Instanciar una clase declarando un objeto
		Persona valentino = new Persona(), julian = new Persona(); 
		
		valentino.setNombre("Valentino Diaz");
		valentino.setPais("Tangamendapio");
		valentino.setEdad(14);
		
		julian.setNombre("Julian Camacho");
		julian.setPais("Colombia");
		julian.setEdad(33);
		
		// Herencia
		// Instancias de clases heredadas de la clase vehiculo
		Taxi taxiAmarillo = new Taxi();
		
		taxiAmarillo.setMatricula("vmw859");
		taxiAmarillo.setModelo("2024");
		taxiAmarillo.setPotencia(1600);
		taxiAmarillo.setLicencia("168456");
		
		taxiAmarillo.encender();
		System.out.println("Datos del taxi[Matricula: "+taxiAmarillo.getMatricula()+" Modelo: " + taxiAmarillo.getModelo()
		+ " Potencia: " + taxiAmarillo.getPotencia() + " Licencia: " + taxiAmarillo.getLicencia());
		taxiAmarillo.apagar();

		System.out.println();
		
		Autobus bus = new Autobus();
		
		bus.setMatricula("mmg965");
		bus.setModelo("2023");
		bus.setPotencia(15000);
		bus.setPuestos(40);
		
		bus.encender();
		System.out.println("Datos del autobus [Matricula: "+bus.getMatricula()+" Modelo: " + bus.getModelo()
		+ " Potencia: " + bus.getPotencia() + " Puestos: " + bus.getPuestos());
		bus.apagar();
		
		System.out.println();
		
		// Implementacion de poliformismo de metodos
		Clarinete clarineteNegro = new Clarinete();		
		clarineteNegro.tocar();
		
		System.out.println();
		
		// Ejecucion de la clase anidada(Administrador) en la clase adjunta(Usuario)
		Usuario usuario = new Usuario("Isabel");
		usuario.establecerRoles();
		
		System.out.println();
		
		// Implementacion de clases abstractas y metodos abstractos
		
		Cuadrado cuadrado = new Cuadrado("rojo", 78);
		System.out.println("Area del cuadrado " + cuadrado.getColor() + " es: " + cuadrado.calcularArea());
		
		System.out.println();
		
		Triangulo triangulo = new Triangulo("azul", 45, 67);
		System.out.println("Area del triangulo " + triangulo.getColor() + " es: " + triangulo.calcularArea());
		
		System.out.println();
		
		// Implementacion de una interfaz por medio de una clase instanciada
		barcoPirata srFrancis = new barcoPirata();
		
		srFrancis.setX(45);
		srFrancis.setY(60);
		
		srFrancis.moverPosicion(20, 30);
		
		srFrancis.conocerPosicion();
		
		srFrancis.disparar();
		
		System.out.println();
	}

}
