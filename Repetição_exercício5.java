package repeti��o;

import java.util.Scanner;

public class Repeti��o_exerc�cio5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num = 0, soma=0;
		
		do
		{
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			
			soma = soma+num;
		
		}
			while(num!=0);
			{
				
			}System.out.println(" A soma de todos os n�meros digitados �: "+soma);
	}

}
