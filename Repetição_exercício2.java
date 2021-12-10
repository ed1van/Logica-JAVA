package repetição;

import java.util.Scanner;

public class Repetição_exercício2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num, par=0, impar=0;
		
		for(num=1;num<11;num++)
		{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
		
		if(num%2==0)
		{	
			par = par + 1;
			
			System.out.println("Esse número é Par");
		}
		else
		{
			
			impar = impar + 1;
			
			System.out.println("Esse número é Impar");
		}
			
	}	System.out.println("O total de números Pares é "+par);
		System.out.println("O total de números Impares é "+impar);
	}
}
