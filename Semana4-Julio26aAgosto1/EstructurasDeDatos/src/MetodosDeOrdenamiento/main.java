package MetodosDeOrdenamiento;

public class main {
	
	public static void imprimirVector(int[] arr) {
		System.out.println("Vector");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void vectorAleatorio(int[] arr) {		

		for (int i = 1; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
	}
	
	public static void main(String args[]) {
		
		int[] vector = new int[10];
		int[] vector2 = new int[10];
		int[] vector3 = new int[10];
		int[] vector4 = new int[10];

		vectorAleatorio(vector);
		vectorAleatorio(vector2);
		vectorAleatorio(vector3);
		vectorAleatorio(vector4);
		
		
		Burbuja classBurbuja = new Burbuja();
		Insercion classInsercion = new Insercion();
		Seleccion classSeleccion = new Seleccion();
		MergeSort classMeSort = new MergeSort();
		
		System.out.println("Burbuja");
		imprimirVector(vector);
		classBurbuja.ordenar(vector);
		imprimirVector(vector);
		System.out.println("Insercion");
		imprimirVector(vector2);
		classInsercion.ordenar(vector2);
		imprimirVector(vector2);
		System.out.println("Seleccion");
		imprimirVector(vector3);
		classSeleccion.ordenar(vector3);
		imprimirVector(vector3);
		System.out.println("MergeSort");
		imprimirVector(vector4);
		classMeSort.mergeSort(vector4);
		imprimirVector(vector4);
		
		

	}

}
