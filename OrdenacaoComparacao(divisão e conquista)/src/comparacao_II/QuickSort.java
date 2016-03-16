package comparacao_II;

import sorting.AbstractSorting;
import sorting.Util;

public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {
	/* SORT
	 * achar o pivot(int) = partition
	 * se left for menor que pivot-1 (sort)
	 * se pivot for menor que right (sort)
	 * 
	 * 	partition
	 * pivot vai ser o elemento do meio
	 * int i = leftIndex;
	 * int j = rightIndex;
	 * 
	 * enquanto i e j se aproximar do pivot
	 * enquanto array[esquer de pivot] for menor que pivot i++
	 * enquanto array[direita de pivot] for maior que pivot j--
	 * se depois do while i <= j
	 * troca e i++ j--
	 */

	@Override
	public void sort(T[] array,int leftIndex, int rightIndex) {			
		if(leftIndex < rightIndex){
			// achar o pivot
			int indexPivot = partition(array, leftIndex, rightIndex);
			
			// se left for menor que pivot-1
			// sort
			if (leftIndex < indexPivot - 1){
				sort(array,leftIndex, indexPivot -1 );
			}
			// se left for menor que pivot-1
			// sort
			if (indexPivot < rightIndex){
				sort(array,indexPivot, rightIndex);
			}
		}
	}

	private int partition(T[] array, int leftIndex, int rightIndex) {
		// pivot vai esta no meio
		T pivot = array[(leftIndex + rightIndex) / 2];
		
		int i = leftIndex;
		int j = rightIndex;
		
		// enquanto i e j se aproximar do pivot
	    while (i <= j) {
	    	// enquanto array[esquer de pivot] for menor que pivot i++
	    	while (array[i].compareTo(pivot) == -1){
	    		i++;
	        }
	    	// enquanto array[direita de pivot] for maior que pivot j--
	    	while (array[j].compareTo(pivot) == 1){
	    		j--;
	    	}
	    	// se depois do while i <= j
	    	// troca e i++ j--
	        if (i <= j) {
	        	Util.swap(array, i, j);
	            i++;
	            j--;
	        }
	    }
		return i;
	}
	
	
	    	
}