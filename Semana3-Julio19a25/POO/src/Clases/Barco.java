package Clases;

// Interfaces: Una interfaz en Java es una colección de métodos abstractos y propiedades
//             constantes. En las interfaces se especifica qué se debe hacer, pero no su
//             implementación. Serán las clases que implementen estas interfaces y describan la
//             lógica del comportamiento de los métodos
public interface Barco {
	
	//Todos los métodos de una interfaz se declaran implícitamente como	abstractos y públicos.
	void moverPosicion (int x, int y);
	void disparar();
}
