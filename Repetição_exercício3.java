package repetição;

import java.util.Scanner;

public class Repetição_exercício3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int idade=0, maior=0, menor=0;
		
		while(idade<100)
		{
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			if(idade<=21)
			{
				menor ++;
				
			}
			else if(idade>50)
			{
				maior ++;
			}
		}
		
		System.out.println("Quantidade de pessoas com menos de 21 anos é de "+menor);
		System.out.println("Quantidade de pessoas com mais de 50 anos é de "+maior);
	}

}
