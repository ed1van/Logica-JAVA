package laços_decisão;

	import java.util.Scanner;

public class Exercício1 {

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
			System.out.println(maior+", ou seja, o X é o maior número");
						
		} 
		else if(y>z && y>x)
		{
			maior = maior + y;
			System.out.println(maior+", ou seja, o Y é o maior número");
		}
		
		else if(z>x && z>y)
		{
			maior = maior + z;
			System.out.println(maior+", ou seja, o Z é o maior número");
		}
		
		
		
		
		
		

	} 

}
