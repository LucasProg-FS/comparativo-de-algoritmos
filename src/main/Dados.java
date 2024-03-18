package main;
import java.util.Random;

public class Dados {

	public int[] criar(int tamanho) {
		int[] dados = new int[tamanho];
		
		Random aleatorio = new Random();
		
		for (int i = 0; i < tamanho; i++) {
			dados[i] = aleatorio.nextInt(1000);
			
		}
		
		return dados;
	}
}
