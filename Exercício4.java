package laços_decisão;

import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		int num, x;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		System.out.println(num);
		if(num%2==0)
		{
			
			java.lang.Math.sqrt(num);
			System.out.println("Este número é Par. e sua raiz quadrada é "+Math.sqrt(num));
		}
		
		else
		{
			num = num * num;
			System.out.println("Este número é ímpar. e seu número elevado ao quadrado é "+num);
		}

	}

}
