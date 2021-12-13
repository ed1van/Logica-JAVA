package vetor_e_matrizes;

import java.util.Scanner;

public class Mat_ExercícioExtra1 {

	public static void main(String[] args) {


		Scanner ler = new Scanner (System.in);
		
		int mat[][] = new int [3][3], c, l, v, cont=0;
		
		for(l=0; l<3;l++) 
		{
			for(c=0; c<3;c++) 
				
			{
				System.out.println("Digite um número: ");
				mat[l][c] = ler.nextInt();
				
			
			if(mat[l][c]>10)
			{
				cont++;
				
			}
			
		}
			
			
		}	System.out.println("Foram contabilizadas "+cont+" vezes um número maior que 10");
		

	}

}
