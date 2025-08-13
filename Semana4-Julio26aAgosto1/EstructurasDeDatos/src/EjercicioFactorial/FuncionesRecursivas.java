package EjercicioFactorial;

public class FuncionesRecursivas {

	public FuncionesRecursivas() {

	}

	public int factorial(int numero) {
		if (numero <= 1) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}
	
	// Sumar los números naturales hasta N (se lo damos nosotros) de forma recursiva.
	public int sumaNaturales(int numero) {
		if (numero<=0) {
			return 0;
		}
		else {
			return numero + sumaNaturales(numero-1);
		}
	}
	
	// Recorrer un array de forma recursiva.
	public void recorrerUnArray(int i, int[] arr) {
		if (i == arr.length) {
			return;
		}

		System.out.println("Elemento en la posicion " + i + ": " + arr[i]);
		recorrerUnArray(i + 1, arr);

	}
	
	//Recorrer una matriz de forma recursiva.
	public void recorrerMatriz (int i,int j, int[][] M) {
		if (i >= M.length) {
			return;
		}
		else if (j >= M[0].length) {
			recorrerMatriz(i+1, 0, M);
			return;
		}
		System.out.println("Elemento en la posicion["+i+", "+j+"]: "+M[i][j]);
		recorrerMatriz(i, j+1, M);
	}
	
	// Haz una función que obtenga el maximo numero de un array, pasandole el array, el indice y el numero maximo actual.
	// Otra función sin que sea necesario el tercer parámetro.
	
	public int mayorDeUnArray(int i, int[] arr, int max) {
		if (i != arr.length) {
			
			if (arr[i] > max) {
				return max = mayorDeUnArray(i+1, arr, arr[i]);
			} else {
				return max = mayorDeUnArray(i+1, arr, max);
			}
		}
		return max;
	}
	
	public int mayorDeUnArray(int i, int[] arr) {
		int max = Integer.MIN_VALUE;
		
		if (i != arr.length) {
			max = Math.max(arr[i], mayorDeUnArray(i+1, arr));
		}
		return max;
	}
	
	public int menorDeUnArray(int i, int[] arr) {
		int min = Integer.MAX_VALUE;
		
		if (i != arr.length) {
			min = Math.min(arr[i], menorDeUnArray(i+1, arr));			
		}
		return min;
	}
	
	// Calcular el valor de la posición fibonacci usando recursividad.
	public int fibonacci(int n) {
		if (n==0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
