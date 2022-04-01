package Uninter;

public class ComputadorC extends Computador{

	public void Jogada(Tabuleiro tab) { 
		// Lógica de Jogada : 
		// Computador joga no primeiro espaço livre seguindo a coluna, começando na terceira linha.
		
		do {
			for(int coluna = 2; coluna > -1; coluna--) {
				for(int linha = 2; linha > -1; linha--) {
					if(tab.getTab()[linha][coluna] == 0) {
						jogada[0] = linha;
						jogada[1] = coluna;
					}
				}	
			}
		}while(!checaJogada(jogada, tab));
	}
}