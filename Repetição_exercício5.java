package repetição;

import java.util.Scanner;

public class Repetição_exercício5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num = 0, soma=0;
		
		do
		{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			soma = soma+num;
		
		}
			while(num!=0);
			{
				
			}System.out.println(" A soma de todos os números digitados é: "+soma);
	}

}
