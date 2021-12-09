package laços_decisão;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite um número: ");
		a = ler.nextInt();
		System.out.println("Digite um número: ");
		b = ler.nextInt();
		System.out.println("Digite um número: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("A sequencia é "+a+" "+b+" "+c);
		}
		
		else if(a<c && c<b)
		{
			System.out.println("A sequencia é "+a+" "+c+" "+b);
		}
		
		
		else if(b<a && a<c) {
				System.out.println("A sequencia é "+b+" "+a+" "+c);
			}
		else if(b<c && c<a)
		{
			System.out.println("A sequencia é "+b+" "+c+" "+b);
		}
		
		else if(c<=a && a<=b)
				{
					System.out.println("A sequencia é "+c+" "+a+" "+b);
				}
		else if(c<b && b<a)
		{
			System.out.println("A sequencia é "+c+" "+b+" "+a);
		}
			
	}

}
