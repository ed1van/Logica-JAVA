package la�os_decis�o;

import java.util.Scanner;

public class Exerc�cio3 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite um n�mero: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Voc� est� na categoria Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Voc� se est� na categoria Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Voc� est� na categoria Adulto");
		}
		else
		{
			System.out.println("N�o existe categoria para sua idade!");
		}
	}

}
