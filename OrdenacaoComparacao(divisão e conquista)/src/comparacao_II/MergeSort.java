package comparacao_II;

import sorting.AbstractSorting;

public class MergeSort <T extends Comparable<T>> extends AbstractSorting<T>{

		@Override
		public void sort(T[] array, int leftIndex, int rightIndex) {
			//Se left for menor que right
			if(leftIndex < rightIndex){
				// meio = = leftIndex + (rightIndex - leftIndex) / 2;
				int meio = leftIndex + (rightIndex - leftIndex) / 2;
				// sort(left, meio)
				sort(array, leftIndex, meio);
				//sort(meio+1, right)
				sort(array, meio+1, rightIndex);
				// merge
				merge(array, leftIndex, rightIndex, meio);
			}
		}

		private void merge(T[] array, int leftIndex, int rightIndex, int meio) {
			// Criar array auxiliar como o tamanho do array inicial
			T[] aux = (T[]) new Comparable[array.length];
			
			// Copia todos os dados do array original para o auxiliar
			for(int i=leftIndex; i<=rightIndex; i++) {
				aux[i] = array[i];
			}
			
			// i= inicio do array, j = meio+1, k = inicio do array
			int i=leftIndex;
			int j=meio+1;
			int k=leftIndex;
			
			// i <=meio, j <= right 
			// compara o array[i] com o array[j]
			// o menor vai para a posicao k no array auxiliar
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
			
			// i <=meio, j > right 
			// todos os array[i] vao para a posicao k no array auxiliar			
			while(i<=meio) {
				array[k] = aux[i];
				i++;
				k++;
			}
			
			// i > meio, j <= right 
			// todos os array[j] vao para a posicao k no array auxiliar		
			while(j<=rightIndex) {
				array[k] = aux[j];
				j++;
				k++;
			}
		}
		
			
}
