package Uninter;

import java.util.Random;

public class ComputadorA extends Computador{
	
	public int jogar(Tabuleiro tab) {
		Jogada(tab);
		tab.setJogada(jogada, vez);
		return -1;
	}
	public void Jogada(Tabuleiro tab) {
		Random random = new Random();
		do {
		jogada[0] = random.nextInt(3);
		jogada[1] = random.nextInt(3);
	}while(!checaJogada(jogada, tab));
			
	}
}