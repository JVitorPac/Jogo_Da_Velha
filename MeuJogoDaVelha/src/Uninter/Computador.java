package Uninter;

public abstract class Computador { // Classe referência para ComputadorA, ComputadorB e ComputadorC.
	
	public int[] jogada = new int[2];
	public int vez = 2;
	
	public int jogar(Tabuleiro tab) {
		Jogada(tab);
		tab.setJogada(jogada, vez);
		return -1;
	}
	protected abstract void Jogada(Tabuleiro tab);
	
	public boolean checaJogada(int[] jogada, Tabuleiro tab) {
		if(tab.getPosicao(jogada) == 0)
			return true;
		else
			return false;
	}
}