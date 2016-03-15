package sorting;

public interface Sorting<T extends Comparable<T>> {
    
	/**
	 * It sorts the array in increasing order considering all its elements.
	 * 
	 * @param array  the target of the sorting algorithm
	 */
	public void sort(T[] array);
}