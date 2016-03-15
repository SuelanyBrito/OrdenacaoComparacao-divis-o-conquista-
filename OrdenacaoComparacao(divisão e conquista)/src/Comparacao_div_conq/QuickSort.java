package Comparacao_div_conq;

import sorting.AbstractSorting;
import sorting.Util;

public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array,int leftIndex, int rightIndex) {			
		if(leftIndex < rightIndex){
			int indexPivot = partition(array, leftIndex, rightIndex);
			
			if (leftIndex < indexPivot - 1){
				sort(array,leftIndex, indexPivot -1 );
			}
			if (indexPivot < rightIndex){
				sort(array,indexPivot, rightIndex);
			}
		}
	}

	private int partition(T[] array, int leftIndex, int rightIndex) {
		
		T pivot = array[(leftIndex + rightIndex) / 2];
		int i = leftIndex;
		int j = rightIndex;
		
	    while (i <= j) {
	    	while (array[i].compareTo(pivot) == -1){
	    		i++;
	        }
	    	while (array[j].compareTo(pivot) == 1){
	    		j--;
	    	}
	        if (i <= j) {
	        	Util.swap(array, i, j);
	            i++;
	            j--;
	        }
	    }
		return i;
	}
}