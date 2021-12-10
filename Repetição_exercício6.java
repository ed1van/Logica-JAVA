package repetição;

import java.util.Scanner;

public class Repetição_exercício6 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		
		double num, media=0, cont=0, soma=0;
		
		do
		{
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			if(num%3==0) {
				cont = cont + 1;
				soma = soma +num;
				media = soma / cont;
			}
		
		}
		while(num!=0);
		{
			
		} 
		System.out.println("aaa"+media );
	}

}
