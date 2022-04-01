package Uninter;

public class Tabuleiro {
	
	public int tab[][]= new int[3][3]; // Matriz tabuleiro
	
	public void visualizar(){ // Parte visual do Tabuleiro
	
		System.out.println();
    
		for(int linha = 0 ; linha < 3 ; linha++){
    
        
			for(int coluna = 0 ; coluna < 3 ; coluna++){
            
            
				if(tab[linha][coluna] == -1){
                System.out.print(" X ");
				}
				if(tab[linha][coluna] == 1){
                System.out.print(" O ");
				}
				if(tab[linha][coluna] == 0){
                System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}
	public int getPosicao(int[] jogada){
        return tab[jogada[0]][jogada[1]];
	} // Recolhe o lugar selecionado no tabuleiro para validar a jogada
	
	public void setJogada(int[] jogada, int vez) {
		// vez == 1 (Jogador)
		if(vez == 1)
			tab[jogada[0]][jogada[1]] = 1;
		// vez != 1 (Computador)
		else
			tab[jogada[0]][jogada[1]] = -1;
	}
	
	public int situacao() {
		 for(int linha = 0 ; linha < 3 ; linha++){ // Loop que checa colunas

	            if( (tab[linha][0] == 1 & tab[linha][1] == 1 & tab[linha][2] == 1))
	            	return 1;
	            else if( (tab[linha][0] == -1 & tab[linha][1] == -1 & tab[linha][2] == -1))
	                return -1;
		 }
		 for(int coluna = 0 ; coluna < 3 ; coluna++){ // Loop que checa linhas

	            if( (tab[0][coluna] == 1 & tab[1][coluna] == 1 & tab[2][coluna] == 1))
	                return 1;
	            else if( (tab[0][coluna] == -1 & tab[1][coluna] == -1 & tab[2][coluna] == -1))
	                return -1;
		 }
		 
		 // Condicionais que farão a checagem das diagonais	 	
		 
		 if( (tab[0][0] == 1 & tab[1][1] == 1 & tab[2][2] == 1))
			 return 1;
		 else if( (tab[0][0] == -1 & tab[1][1] == -1 & tab[2][2] == -1))
			 return -1;
		 else if( (tab[0][2] == 1 & tab[1][1] == 1 & tab[2][0] == 1))
			 return 1;
		 else if( (tab[0][2] == -1 & tab[1][1] == -1 & tab[2][0] == -1))
			 return -1;
		 
		 // Condicional que reconhece a leitura de empate
		 
		 if(empate() == true) {
		 	 return 2;
		 }
		 return 0;
	}
	
	public void ganhador() { // Leitura do Ganhador
		if(situacao() == 1) {
			System.out.println("Parabéns, você venceu! =)");
		}
		if(situacao() == -1) {
			System.out.println("Computador venceu, mais sorte na próxima vez! =(");
		}
	}
	
	public boolean empate() { // Leitura de Empate
		 for(int linha = 0 ; linha < 3 ; linha++){
		        for(int coluna = 0 ; coluna < 3 ; coluna++){
		        	if(tab[linha][coluna] == 0) 
		        		return false;
		        }       
		 }
		return true;
	}
	
	public int[][] getTab() { // getter para tratamento de jogadas ComputadorB e ComputadorC
		return tab;
	}
}	
