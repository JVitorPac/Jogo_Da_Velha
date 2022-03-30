package Uninter;

import java.util.Scanner;

public class Jogo {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		Tabuleiro tab = new Tabuleiro();
		Jogador jogador = new Jogador();
		teclado = new Scanner(System.in);
		
		System.out.println("Bem Vindo ao Jogo da Velha!");
		System.out.println();
		System.out.println("Escolha a dificuldade do computador 1, 2 ou 3:");

		int opcao = teclado.nextInt();
		
		Computador comp = null;
		
		while(comp == null) {
		if(opcao==1) {
			comp= new ComputadorA();
		}
		else if(opcao==2) {
			comp= new ComputadorB();
		}
		else if(opcao==3) {
			comp= new ComputadorC();
		}
		else {
			System.out.println("Dificuldade Inválida!");
			System.out.println();
			System.out.println("Escolha a dificuldade do computador 1, 2 ou 3:");
			opcao = teclado.nextInt();
		}
		}
		
		int vez = 1;
		tab.visualizar();
		
		while(tab.situacao() == 0) {
			
			if(vez== 1 ) { // Jogador
				jogador.jogar(tab);
				vez=2;
			}
			else if(vez== 2 ) { // Computador
				System.out.println("Jogada Computador");
				comp.jogar(tab);
				vez=1;
			}
			tab.visualizar();
			System.out.println();
			tab.ganhador();
		}
	}
}