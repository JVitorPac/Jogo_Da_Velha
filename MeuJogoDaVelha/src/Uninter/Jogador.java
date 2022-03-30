package Uninter;

import java.util.Scanner;

public class Jogador {
	public int vez = 1;
	public Scanner teclado = new Scanner(System.in);
	public int[] jogada = new int[2];
	
	public int jogar(Tabuleiro tab) {
		Jogada(tab);
		tab.setJogada(jogada, vez);
		return 1;
		
	}
	public void Jogada(Tabuleiro tab) {
		System.out.println("Sua vez!");
		System.out.println();
		
		do { // Loop validação entrada de dados
			
			do { // Entrada Jogada[0] (Linha)
			
				System.out.print("Digite a linha: ");	
				jogada[0] = teclado.nextInt();
				
				// Reduz 1 a entrada para tornar compátivel á matriz do tabuleiro
				jogada[0]--;
				
				if(jogada[0] < 0 | jogada[0] > 2) { // Validação de Linha
					System.err.println("Linha Inválida!");
					System.out.println();
				}
			
			}while(jogada[0] < 0 | jogada[0] > 2);
		
			do { // Entrada Jogada[1] (Coluna)
				
				System.out.print("Digite a coluna:");
				jogada[1] = teclado.nextInt();
				
				// Reduz 1 a entrada para tornar compátivel á matriz do tabuleiro
				jogada[1]--;
				
				if(jogada[1] < 0 | jogada[1] > 2) { // Validação de Coluna
					System.err.println("Coluna Inválida");
					System.out.println();
				
				}
			}while(jogada[1] < 0 | jogada[1] > 2);
			
			if(!checaJogada(jogada, tab))
		          System.out.println("Espaço já selecionado!");

		}while(!checaJogada(jogada, tab));
	}
	public boolean checaJogada(int[] jogada, Tabuleiro tab) {
		if(tab.getPosicao(jogada) == 0)
			return true;
		else
			return false;
	}
	
}
