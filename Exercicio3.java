package logica02;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner( System.in );
		int segundos;
		
		System.out.print("Digite os segundos: ");
		segundos = ler.nextInt();
		
		
		System.out.println(" O tempo em horas �: "+segundos/3600);
		System.out.println(" O tempo em minutos �: "+segundos/60);
		System.out.println(" O tempo em segundos �: "+segundos);
		
		
		
		

	}

}
