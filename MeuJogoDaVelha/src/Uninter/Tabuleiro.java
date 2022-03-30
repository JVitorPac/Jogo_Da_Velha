package Uninter;

public class Tabuleiro {
	
	public int tab[][]= new int[3][3]; //Matriz tabuleiro
	
	public void visualizar(){
	
		System.out.println();
    
		for(int lin=0 ; lin<3 ; lin++){ // lin = Linha
    
        
			for(int col=0 ; col<3 ; col++){ // col = Coluna
            
            
				if(tab[lin][col]==-1){
                System.out.print(" X ");
				}
				if(tab[lin][col]==1){
                System.out.print(" O ");
				}
				if(tab[lin][col]==0){
                System.out.print(" - ");
				}
			}
			System.out.println();
		}
	}
	public int getPosicao(int[] jogada){
        return tab[jogada[0]][jogada[1]];
	} // Recolhe o lugar selecionado no tabuleiro para validar a jogada
	
	public void setJogada(int[]jogada, int vez) {
		// vez == 1 (Jogador)
		if(vez == 1)
			tab[jogada[0]][jogada[1]] = 1;
		// vez != 1 (Computador)
		else
			tab[jogada[0]][jogada[1]] = -1;
	}
	
	public int situacao() {
		 for(int lin=0 ; lin<3 ; lin++){ // Loop que checa colunas

	            if( (tab[lin][0] == 1 & tab[lin][1] == 1 & tab[lin][2] == 1))
	            	return 1;
	            else if( (tab[lin][0] == -1 & tab[lin][1] == -1 & tab[lin][2] == -1))
	                return -1;
		 }
		 for(int col=0 ; col<3 ; col++){ // Loop que checa linhas

	            if( (tab[0][col] == 1 & tab[1][col] == 1 & tab[2][col] == 1))
	                return 1;
	            else if( (tab[0][col] == -1 & tab[1][col] == -1 & tab[2][col] == -1))
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
		 
		 if(empate() == true) {
			 System.err.println("Jogo empatado, deu velha!");
		 	 return 2;
		 }
		 return 0;
	}
	public void ganhador() {
		if(situacao() == 1) {
			System.out.println("Parabéns, você venceu! =)");
		}
		if(situacao() == -1) {
			System.out.println("Computador venceu, mais sorte na próxima vez! =(");
		}
	}
	public boolean empate() {
		 for(int lin=0 ; lin<3 ; lin++){
			    
		        for(int col=0 ; col<3 ; col++){
		        	if(tab[lin][col] == 0) 
		        		return false;
		        }       
		 }
		return true;
	}
}	
