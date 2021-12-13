package vetor_e_matrizes;

import java.util.Scanner;

public class Vet_ExercícioExtra1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int vet[] = {1, 0, 5, 100, -5, 7}, soma=0, y;
		
		for(y=0;y<6;y++)
		{
			System.out.print("|"+vet[y]+"|");
		}
		
		soma = (vet[0]+vet[1]+vet[5]);
		
		
		
		System.out.println("\nA soma da posição 0, 1 e 5 é: "+soma);
	}

}
