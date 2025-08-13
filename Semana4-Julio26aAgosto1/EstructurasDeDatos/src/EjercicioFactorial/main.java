package EjercicioFactorial;
/* RECURSIVIDAD: Las funciones recursivas son aquellas que se llaman a si mismas en un momento de su ejecucion.
                 Para usar estas funciones, es necesario conocer una solucion no recursiva a alguno de los casos mas sencillos.
                 De esta forma esta funcion tiene una linea de codigo que devuelve un resultado que sera el ultimo al 
                 terminas la ejecucion*/

/* Ejercicio de factorial
   Calcular el factorial (Wikipedia, 2023b) de un número con recursividad es el típico ejemplo 
   para explicar este método de programación. Recordemos que el factorial de un número consiste en
   multiplicar dicho número por todos sus anteriores hasta llegar a 1.*/

public class main {
	public static void main(String args[]) {
		
		int numero = 10;
		
		FuncionesRecursivas recursividad = new FuncionesRecursivas();
		System.out.println("Factorial de "+numero+": "+ recursividad.factorial(numero));

		System.out.println("Sumatoria de numero naturales hasta "+numero+": "+ recursividad.sumaNaturales(numero));
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*100);
		}
		
		recursividad.recorrerUnArray(0, arr);

		int[][] matriz = new int[5][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) (Math.random()*100);
			}
		}
		
		recursividad.recorrerMatriz(0, 0, matriz);
		
		System.out.println("Mayor del vector arr: "+recursividad.mayorDeUnArray(0, arr));
		System.out.println("Menor del vector arr: "+recursividad.menorDeUnArray(0, arr));
		
		System.out.println("Posicion "+numero+" de la serie de Fibonacci: "+recursividad.fibonacci(numero));
		
	}

}
