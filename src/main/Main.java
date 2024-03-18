package main;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Dados array = new Dados();
		
		int[] resultadoTamanho100 = array.criar(100);
		int[] resultadoTamanho1000 = array.criar(1000);
		int[] resultadoTamanho10000 = array.criar(10000);

		System.out.println("1ª Massa de teste para entrada de tamanho 100:\n");
		
		Algoritmos.bubbleSort(Arrays.copyOf(resultadoTamanho100, resultadoTamanho100.length ));
		Algoritmos.selectionSort(Arrays.copyOf(resultadoTamanho100, resultadoTamanho100.length ));
		Algoritmos.insertionSort(Arrays.copyOf(resultadoTamanho100, resultadoTamanho100.length ));
		
		System.out.println("\n----------------------------------------------------------");
		
		System.out.println("\n2ª Massa de teste para entrada de tamanho 1.000:\n");
		
		Algoritmos.bubbleSort(Arrays.copyOf(resultadoTamanho1000, resultadoTamanho1000.length ));
		Algoritmos.selectionSort(Arrays.copyOf(resultadoTamanho1000, resultadoTamanho1000.length ));
		Algoritmos.insertionSort(Arrays.copyOf(resultadoTamanho1000, resultadoTamanho1000.length ));
		
		System.out.println("\n----------------------------------------------------------");
		
		System.out.println("\n3ª Massa de teste para entrada de tamanho 10.000:\n");
		
		Algoritmos.bubbleSort(Arrays.copyOf(resultadoTamanho10000, resultadoTamanho10000.length ));
		Algoritmos.selectionSort(Arrays.copyOf(resultadoTamanho10000, resultadoTamanho10000.length ));
		Algoritmos.insertionSort(Arrays.copyOf(resultadoTamanho10000, resultadoTamanho10000.length ));
	}

}
