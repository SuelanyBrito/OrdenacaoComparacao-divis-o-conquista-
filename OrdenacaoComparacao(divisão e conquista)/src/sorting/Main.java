package sorting;

import comparacao_I.BubbleSort;
import comparacao_I.InsertionSort;
import comparacao_I.SelectionSort;
import comparacao_II.QuickSort;

public class Main {
	public static void main(String[] args) {
		Integer[] par = {30, 28, 7, 29, 11, 26, 4, 22, 23, 31};
		Integer[] impar = {6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36};
		Integer[] vazio = {};
		Integer[] repetidos = {4, 9, 3, 4, 0, 5, 1, 4};
		Integer[] iguais = {6, 6, 6, 6, 6, 6};
		
		//AbstractSorting<Integer> implementation = new MergeSort<Integer>();
		//AbstractSorting<Integer> implementation = new QuickSort<Integer>();
		AbstractSorting<Integer> implementation = new BubbleSort<Integer>();
		//AbstractSorting<Integer> implementation = new InsertionSort<Integer>();
		//AbstractSorting<Integer> implementation = new SelectionSort<Integer>();
		
		implementation.sort(par);
		implementation.sort(impar);
		implementation.sort(vazio);
		implementation.sort(repetidos);
		implementation.sort(iguais);
		
		String vPar = "";
		String vImpar = "";
		String vRepetidos = "";
		String vIguais = "";
		
		for (int i = 0; i < par.length; i++){
			if (i == par.length-1){
				vPar += par[i];
			}else{
				vPar += par[i] + ",";
			}			
		}
		
		for (int i = 0; i < impar.length; i++){
			if (i == impar.length-1){
				vImpar += impar[i];
			}else{
				vImpar += impar[i] + ",";
			}			
		}
				
		for (int i = 0; i < repetidos.length; i++){
			if (i == repetidos.length-1){
				vRepetidos += repetidos[i];
			}else{
				vRepetidos += repetidos[i] + ",";
			}
		}
		
		for (int i = 0; i < iguais.length; i++){
			if (i == iguais.length-1){
				vIguais += iguais[i];
			}else{
				vIguais += iguais[i] + ",";
			}
			
		}
		
		System.out.println(vPar);
		System.out.println(vImpar);
		System.out.println(vRepetidos);
		System.out.println(vIguais);
			
}
}
