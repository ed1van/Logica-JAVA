package repeti��o;

import java.util.Scanner;

public class Repeti��o_exerc�cio2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num, par=0, impar=0;
		
		for(num=1;num<11;num++)
		{
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
		
		if(num%2==0)
		{	
			par = par + 1;
			
			System.out.println("Esse n�mero � Par");
		}
		else
		{
			
			impar = impar + 1;
			
			System.out.println("Esse n�mero � Impar");
		}
			
	}	System.out.println("O total de n�meros Pares � "+par);
		System.out.println("O total de n�meros Impares � "+impar);
	}
}
