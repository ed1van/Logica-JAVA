package logica02;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner( System.in );
		int anos, meses=12, dias=365, idaded;
		
		System.out.print("Digite sua idade: ");
		anos = ler.nextInt();
		
		
		idaded = anos * 365;
		
		System.out.println("Você tem "+idaded+ " dias de vida");


	}

}
