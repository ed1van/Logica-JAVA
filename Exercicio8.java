package logica02;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {


		Scanner ler = new Scanner( System.in );
		double cc, cf;
		double i=0.45, pd=0.28;
		
		System.out.print("Digite o custo de fábrica : ");
		cf = ler.nextInt();
		
		pd = cf *pd;
		i = cf*i;
		cc = cf + pd + i;
		
		System.out.print("O valor é : "+cc);
		
	}

}
