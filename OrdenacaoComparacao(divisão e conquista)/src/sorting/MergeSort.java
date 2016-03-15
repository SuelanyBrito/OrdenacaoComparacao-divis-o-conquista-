package sorting;

public class MergeSort <T extends Comparable<T>> extends AbstractSorting<T>{

		@Override
		public void sort(T[] array, int leftIndex, int rightIndex) {
			if(leftIndex < rightIndex){
				int meio = leftIndex + (rightIndex - leftIndex) / 2;
				sort(array, leftIndex, meio);
				sort(array, meio+1, rightIndex);
				merge(array, leftIndex, rightIndex, meio);
			}
		}

		private void merge(T[] array, int leftIndex, int rightIndex, int meio) {
			// Criar array auxiliar como o tamanho do array inicial
			T[] aux = (T[]) new Comparable[array.length];
			for(int i=leftIndex; i<=rightIndex; i++) {
				aux[i] = array[i];
			}
			
			int i=leftIndex;
			int j=meio+1;
			int k=leftIndex;
			while(i<=meio && j<=rightIndex) {
				if(aux[i].compareTo(aux[j]) <= 0) {
					array[k] = aux[i];
					i++;
				} else {
					array[k] = aux[j];
					j++;
				}
				k++;
			}
			
			while(i<=meio) {
				array[k] = aux[i];
				i++;
				k++;
			}
			
			while(j<=rightIndex) {
				array[k] = aux[j];
				j++;
				k++;
			}
		}
		
			
}
