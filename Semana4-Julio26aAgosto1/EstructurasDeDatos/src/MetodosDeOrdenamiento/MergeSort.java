package MetodosDeOrdenamiento;

public class MergeSort {
	
	public void mergeSort(int[] arr) {
		// Caso base: cuando la longitud del array es 1 o menor
		if (arr.length <=1) {
			return;
		}
		
		int medio = arr.length/2;
		int[] izq = new int[medio], dch = new int[arr.length-medio];
		
		for (int i = 0; i < medio; i++) {
			izq[i] = arr[i];
		}
		
		for (int i = medio; i < arr.length; i++) {
			dch[i - medio] = arr[i];
		}
		
		mergeSort(izq);
		mergeSort(dch);
		
		merge(arr,izq,dch);
	}
	
	public static void merge(int[] arr, int[] izq, int[] dch) {
		
		int indexIzq=0, indexDch=0, indexArr=0;
		
		while (indexIzq < izq.length && indexDch < dch.length) {
			
			if (izq[indexIzq] <= dch[indexDch]) {
				
				arr[indexArr++] = izq[indexIzq++];
			}
			else {
				arr[indexArr++] = dch[indexDch++];
			}
		}
		
		while (indexIzq < izq.length) {
			arr[indexArr++] = izq[indexIzq++];
		}
		
		while (indexDch < dch.length) {
			arr[indexArr++] = dch[indexDch++];
		}		
		
	}

}
