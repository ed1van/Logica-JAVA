package collections_exercícios;

import java.util.*;

public class C_Loja {

	public static void main (String args[])
	{
		
			Collection<String> nomes = new ArrayList();
			
			nomes.add("Tênis");
			nomes.add("Blusa");
			nomes.add("Camiseta");
			nomes.add("Chinelo");
			nomes.add("Bermuda");
			
			
			System.out.println("Lista do estoque: "+nomes);
			
			nomes.remove("Tênis"); 
			
			System.out.println("Lista do estoque depois de romover um produto: "+nomes); 
			
			
			
			if(nomes.isEmpty()) 
			{
			
				System.out.println("Lista vazia");
			}
			else
			{
				System.out.println("Lista do estoque Atualizada: "+nomes);
			}
			
			
			
	} 
	
}
