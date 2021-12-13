package vetor_e_matrizes;

import java.util.Scanner;

public class Vet_ExercícioExtra2 {

	public static void main(String[] args) {


		Scanner ler = new Scanner (System.in);
		
		int num[] = new int [6], y, par=0, impar=0;
		
		for(y=0;y<6;y++)
		{
			System.out.println("Digite um número: ");
			num[y] = ler.nextInt();
			
		if(num[y]%2==0)
		{
			par = par + num[y];
			
		}
		else
		{
			impar = impar + num[y];
		}
		
		}System.out.println("A soma dos números Pares é igual a: "+par);
			System.out.println("A soma dos números Impares é igual a: "+impar);
	}

}
