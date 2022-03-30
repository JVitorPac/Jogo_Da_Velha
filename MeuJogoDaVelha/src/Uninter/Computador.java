package Uninter;

public abstract class Computador {

	public int[] jogada = new int[2];
	
	public abstract int jogar(Tabuleiro tab);
	
	public int vez = 2;
	
	public boolean checaJogada(int[] jogada, Tabuleiro tab) {
		if(tab.getPosicao(jogada) == 0)
			return true;
		else
			return false;
	}
}