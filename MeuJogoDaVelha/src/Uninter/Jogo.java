package Uninter;

import java.util.Scanner;
import java.util.Random;

public class Jogo {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		Tabuleiro tab = new Tabuleiro();
		Jogador jogador = new Jogador();
		teclado = new Scanner(System.in);
		Random sortear = new Random();
		
		System.out.println("Bem Vindo ao Jogo da Velha!");
		System.out.println();
		System.out.println("Escolha a dificuldade do computador 1, 2 ou 3:");

		int dificuldade = teclado.nextInt();
		
		Computador comp = null;
		
		while(comp == null) { // Instanciação do computador de acorodo com a escolha do jogador
		if(dificuldade == 1) {
			comp= new ComputadorA();
		}
		else if(dificuldade == 2) {
			comp= new ComputadorB();
		}
		else if(dificuldade == 3) {
			comp= new ComputadorC();
		}
		else {
			System.out.println("Dificuldade Inválida!");
			System.out.println();
			System.out.println("Escolha a dificuldade do computador 1, 2 ou 3:");
			dificuldade = teclado.nextInt();
		}
		}
		
		int vez = sortear.nextInt(2) + 1; // Sorteia quam começa o jogo
		
		tab.visualizar();
		
		while(tab.situacao() == 0) {
			
			if(vez == 1 ) { // Jogador
				jogador.jogar(tab);
				vez=2;
			}
			else if(vez == 2 ) { // Computador
				System.out.println("Jogada Computador");
				comp.jogar(tab);
				vez = 1;
			}
			tab.visualizar();
			System.out.println();
			tab.ganhador();
		}
		if(tab.situacao() == 2)
			System.err.println("Jogo empatado, deu velha!");
	}
}