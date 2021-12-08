package logica02;

import java.util.Scanner;


public class Exercicio5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner( System.in );
		int not1, not2, not3, res;
		
		
		System.out.print("Insira a nota do primeiro aluno: ");
		not1 = ler.nextInt();
		System.out.print("Insira a nota do primeiro aluno: ");
		not2 = ler.nextInt();
		System.out.print("Insira a nota do primeiro aluno: ");
		not3 = ler.nextInt();
		
		res = (not1*2 + not2*3 + not3*5)/3;
		
		System.out.println("\n A média é igual a: "+res);
		

	}

}
