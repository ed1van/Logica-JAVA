package logica02;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner( System.in );
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		
		
		System.out.println("Voc� tem  "+idade/365+"  anos de vida");
        System.out.println("Voc� tem  "+idade/30+ "  meses de vida");
        System.out.println("Voc� tem  " + idade+"  em dias de vida");
		
		
		
		
		

	}

}
