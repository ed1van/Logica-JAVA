package repeti��o;

import java.util.Scanner;

public class Repeti��o_exerc�cio4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int pessoas=0, idade, sexo, car=0, pescalm=0, mulhnerv=0, homagre=0, outcalm=0, maisnerv=0, menoscalm=0, posi=1;
		
		
		while(pessoas<150)
		{
			
			System.out.print(posi+++"� Entrevistado\n");
			pessoas = ler.nextInt();
			
			System.out.print(" Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.print(" Digite conforme solicitado\n(1-feminino / 2-masculino / 3-Outros) ");
			sexo = ler.nextInt();
			
			System.out.print(" Digite conforme solicitado \n (1, se voc� for uma pessoa calma; 2, se voc� for uma pessoa nervosa e 3, se voc� for uma pessoa agressiva) ");
			car = ler.nextInt();
			
		
			if(car==1)
			{
				pescalm ++;
			
			}
			if(sexo==1 && car==2)
			{
				mulhnerv ++;
			
			}
			if(sexo==2 && car==3)
			{
				homagre ++;
			}
			if(sexo==3 && car==1)
			{
				outcalm ++;
			}
			if(car==2 && idade>=40)
			{
				maisnerv++;
			}
			if(car==1 && idade<=18)
			{
				menoscalm++;
			}
			
		}System.out.println("O n�mero de pessoas calmas �: "+pescalm);
		System.out.println("O n�mero de mulheres nervosas �: "+mulhnerv);
		System.out.println("O n�mero de homens agressivos �: "+homagre);
		System.out.println("O n�mero de outros calmos �: "+outcalm);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: "+maisnerv);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: "+menoscalm);
	}

}
