package la�os_decis�o;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite um n�mero: ");
		a = ler.nextInt();
		System.out.println("Digite um n�mero: ");
		b = ler.nextInt();
		System.out.println("Digite um n�mero: ");
		c = ler.nextInt();
		
		if(a<=b && b<=c) {
			System.out.println("A sequencia � "+a+" "+b+" "+c);
		}
		
		else if(a<c && c<b)
		{
			System.out.println("A sequencia � "+a+" "+c+" "+b);
		}
		
		
		else if(b<a && a<c) {
				System.out.println("A sequencia � "+b+" "+a+" "+c);
			}
		else if(b<c && c<a)
		{
			System.out.println("A sequencia � "+b+" "+c+" "+b);
		}
		
		else if(c<=a && a<=b)
				{
					System.out.println("A sequencia � "+c+" "+a+" "+b);
				}
		else if(c<b && b<a)
		{
			System.out.println("A sequencia � "+c+" "+b+" "+a);
		}
			
	}

}
