package la�os_decis�o;

	import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int x=0, y, z, maior=0;
		
		System.out.println("Digite o valor de X: ");
		x = ler.nextInt();
		System.out.println("Digite o valor de Y: ");
		y = ler.nextInt();
		System.out.println("Digite o valor de Z: ");
		z = ler.nextInt();
		
		if(x>y && x>z)
		{
			maior = maior + x;
			System.out.println(maior+", ou seja, o X � o maior n�mero");
						
		} 
		else if(y>z && y>x)
		{
			maior = maior + y;
			System.out.println(maior+", ou seja, o Y � o maior n�mero");
		}
		
		else if(z>x && z>y)
		{
			maior = maior + z;
			System.out.println(maior+", ou seja, o Z � o maior n�mero");
		}
		
		
		
		
		
		

	} 

}
