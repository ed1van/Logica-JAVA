package vetor_e_matrizes;

import java.util.Scanner;

public class Mat_Exercício2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int mat[][] = new int [3][3];
		int linha, coluna, soma = 0, somad=0;
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("Digite um número: ");
				mat[linha][coluna] = ler.nextInt();
				
			}
		}
			
			for(linha=0;linha<3;linha++)
			{
				for(coluna=0;coluna<3;coluna++) {
					
					soma = soma + mat[linha][coluna];
					somad = mat[0][0] + mat[1][1] + mat[2][2];
					System.out.print(" || "+ mat[linha][coluna] +" || ");
					
				}System.out.println("\t");
				
			}	System.out.println("\n O Valor da soma total é: "+soma+"\n E a soma da diagonal é: "+somad);
			
		
		
		
	}

}
