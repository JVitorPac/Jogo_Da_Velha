package Uninter;

import java.util.Random;

public class ComputadorA extends Computador{	
	
	public void Jogada(Tabuleiro tab) {
		// Lógica de Jogada : 
		// Computador joga em um lugar aleatório livre.
		
		Random sortear = new Random();
		do {
			jogada[0] = sortear.nextInt(3);
			jogada[1] = sortear.nextInt(3);
		}while(!checaJogada(jogada, tab));
	}
}