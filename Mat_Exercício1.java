package vetor_e_matrizes;

import java.util.Scanner;

public class Mat_Exerc�cio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
		int n2[][] = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
		int mat1[][] = new int[4][6], mat2[][] = new int[4][6];
		int l, c, soma=0, diferen�a=0;
		
				for(l=0; l<4;l++) 
				{
					for(c=0;c<6;c++)
					{
						mat1[l][c] = n1[l][c] + n2[l][c];
						mat2[l][c] = n1[l][c] - n2[l][c];
						soma = mat1[l][c];
						diferen�a = mat2[l][c];
						
					}
				}		System.out.println("A soma das mesmas posi��es � de: "+soma);
						System.out.println("A diferen�a de N1 para N2 � de: "+diferen�a);
		
		}
		

	}

//}
