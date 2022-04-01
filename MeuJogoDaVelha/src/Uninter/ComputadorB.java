package Uninter;

public class ComputadorB extends Computador{

	public void Jogada(Tabuleiro tab) {
		// Lógica de Jogada : 
		// Computador joga no primeiro espaço livre seguindo a linha, começando na terceira coluna.
		
		do {
			for(int linha = 0; linha < 3; linha++) {
				for(int coluna = 0; coluna < 3; coluna++) {
					if(tab.getTab()[linha][coluna] == 0) {
						jogada[0] = linha;
						jogada[1] = coluna;
					}
				}
			}
		}while(!checaJogada(jogada, tab));
	}
}
