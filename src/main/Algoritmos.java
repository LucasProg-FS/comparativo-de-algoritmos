package main;

public class Algoritmos {

	public static void bubbleSort(int[] array) {
		System.out.println("Análise BubbleSort:");
		
		int trocou = 0;
		int comparou = 0;
		
		long iniciou = System.nanoTime();
		for(int i =0; i < array.length - 1 ; i++) {
			for(int j =0; j < array.length - i - 1; j++) {
				comparou += 1;
				if(array[j] > array[j + 1]) {
					int auxiliar = array[j];
					array[j] = array[j+1];
					array[j+1] = auxiliar;
					trocou +=1;
				}
			}
		}
		long finalizou = System.nanoTime();
		
		long tempo = (finalizou - iniciou ) / 1000;
		
		System.out.println("\nTempo de ordenação: " + tempo + " ns");
        System.out.println("Número de trocas: " + trocou);
        System.out.println("Número de comparações: " + comparou);
	}
	
	public static void selectionSort(int[] array) {
		System.out.println("\nAnálise SelectionSort:");
		int trocou = 0;
		int comparou = 0;
		
		long iniciou = System.nanoTime();
		for(int i =0; i < array.length - 1; i++) {
			int menorIndice = i;
			
			for(int j = i + 1; j < array.length; j++) {
				comparou += 1;
				if (array[j] < array[menorIndice]) {
					menorIndice = j;
				}
			}
			
			if ( menorIndice != i) {
				int auxiliar = array[i];
				array[i] = array[menorIndice];
				array[menorIndice] = auxiliar;
				trocou += 1;
			}
		}
		
		long finalizou = System.nanoTime();
		long tempo = (finalizou - iniciou ) / 1000;
		
		System.out.println("\nTempo de ordenação: " + tempo + " ns");
        System.out.println("Número de trocas: " + trocou);
        System.out.println("Número de comparações: " + comparou);
	}

	public static void insertionSort(int[] array) {
		System.out.println("\nAnálise InsertionSort:");
		int trocou = 0;
		int comparou = 0;
		
		long iniciou = System.nanoTime();
		for(int i = 1; i < array.length; i++) {
			int chave = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > chave) {
				array[j+1] = array[j];
				j -= 1;
				trocou += 1;
				comparou += 1;
				
			}
			array[j+1] = chave;
			trocou += 1;
		}
		
		long finalizou = System.nanoTime();
		long tempo = (finalizou - iniciou ) / 1000;
		
		System.out.println("\nTempo de ordenação: " + tempo + " ns");
        System.out.println("Número de trocas: " + trocou);
        System.out.println("Número de comparações: " + comparou);
	}
}
