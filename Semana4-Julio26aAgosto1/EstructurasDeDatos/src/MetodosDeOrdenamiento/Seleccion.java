package MetodosDeOrdenamiento;

public class Seleccion {
	
	public void ordenar(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int indexMin = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]< arr[indexMin]) {
					indexMin = j;
				}				
			}
			int aux = arr[indexMin];
			arr[indexMin] = arr[i];
			arr[i] = aux;
		}
	}	

}
