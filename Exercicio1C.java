package collections_exercícios;

import java.util.*;



public class Exercicio1C {

	private static final int Atualização = 0;

	public static void main(String[] args) {
		
			Scanner ler = new Scanner(System.in);
			int codigo=0, valor = 0; 
			//String edit;
			
			Ex_C a1 = new Ex_C("Blusa",30);
			Ex_C a2 = new Ex_C("Calça",45);
			Ex_C a3 = new Ex_C("Boné",25);
			
			
			ArrayList<Ex_C> estoque = new ArrayList<>();
			
			estoque.add(a1);
			estoque.add(a2);
			estoque.add(a3);
			
			System.out.println("Digite:\n1 para excluir um produto"
					
					+ "\n2 para adicionar um produto"
					+ "\n3 para mostrar o estoque"+
					"\n10 para sair");
			
		while( codigo != 10)
		{
			System.out.println("Digite um código: ");
			codigo = ler.nextInt();
			if(codigo==1)
			{
				
				System.out.println("Digite a posição do produto que deseja remover");
				int remova = ler.nextInt();
				
				estoque.remove(remova);
			
			}
			if(codigo==2)
			{
				
				 System.out.println("Insira o nome do produto que deseja adicionar ");
				 String ad = ler.next();
				 System.out.println("insira a quantidade ");
				 int qt = ler.nextInt();
				 Ex_C a4 = new  Ex_C (ad,qt);
				 estoque.add(Atualização, a4);
				
				
			}
			if(codigo==3)
			{
				System.out.println(estoque.toString());
			}
		
					
					}
				
		}		
		
				
			
			
	}	
	
	


