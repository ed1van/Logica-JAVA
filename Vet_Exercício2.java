package vetor_e_matrizes;

import java.util.Scanner;

public class Vet_Exerc�cio2 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int dado[] = new int [10], x, media=0, soma=0, maior=0;
		
		for(x=0;x<10;x++)
		{
			System.out.println("digite um n�mero: ");
			dado[x] = ler.nextInt();
			soma = soma + dado[x];
			media = soma / 10;
			
		}
		
		
		for(x=0;x<10;x++)
			
		if(dado[x]==6)
			
		{
			
			maior = maior+1;
			
		}
	
			System.out.println("A m�dia �: "+media);
			System.out.println("O maior valor do dado apareceu "+maior+" vezes");
	}

}
