package logica02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner( System.in );
		int a, b, c, d, r, s, res;

		System.out.print("Digite o n�mero de A: ");
		a = ler.nextInt();
		System.out.print("Digite o n�mero de B: ");
		b = ler.nextInt();
		System.out.print("Digite o n�mero de C: ");
		c = ler.nextInt();
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		
		d = (r + s) / 2;
		
		System.out.print("O valor de D � "+d);
	}

}
