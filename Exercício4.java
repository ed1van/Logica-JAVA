package la�os_decis�o;

import java.util.Scanner;

public class Exerc�cio4 {

	public static void main(String[] args) {


		Scanner ler = new Scanner(System.in);
		int num, x;
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		System.out.println(num);
		if(num%2==0)
		{
			
			java.lang.Math.sqrt(num);
			System.out.println("Este n�mero � Par. e sua raiz quadrada � "+Math.sqrt(num));
		}
		
		else
		{
			num = num * num;
			System.out.println("Este n�mero � �mpar. e seu n�mero elevado ao quadrado � "+num);
		}

	}

}
