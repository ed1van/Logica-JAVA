package vetor_e_matrizes;

import java.util.Scanner;

public class Vet_Exerc�cio1 {

	public static void main(String[] args) {
			
		Scanner ler = new Scanner(System.in);
		int vet[] = new int[5], x, maior=0;
		
		
		for(x=0;x<5;x++)
		{
			System.out.print(" Digite um n�mero: ");
			vet[x] = ler.nextInt();
			
		} 
			
		for(x=0;x<5;x++)
		{
		
		if(maior<vet[x])
		{
			
			maior = vet[x];
		} 
		
		}
		imprime(maior);
		
		
	}	
	public static void imprime (int maior)
	{
		System.out.println("O maior valor �: "+maior);
		
	}

}
