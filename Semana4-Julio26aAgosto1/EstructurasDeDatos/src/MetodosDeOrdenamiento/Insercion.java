package MetodosDeOrdenamiento;

public class Insercion {
	
	public void ordenar(int[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			int aux = arr[i];
			int j = i-1;
			while (j>0 && arr[j] > aux) {
				arr[j+1] =arr[j];
				j-=1;
			}
			arr[j+1] = aux;
		}
	}	

}
