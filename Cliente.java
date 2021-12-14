package poo;

public class Cliente {
	//Atributos
	String Nome;
	String Preferencia;
	boolean Restaurante;
	
	//Métodos
	void entrou()
	{
		Restaurante=true;
		
	}
	void saiu()
	{
		Restaurante=false;
	}
	void bemvindo()
	{
		if(Restaurante==true)
			System.out.println("Vou querer comer isso aqui, poderia busca-lô? ");
			
		else {
			System.out.println("Não irei comer nada hoje... ");
		}
		
	}  
	
	public void status()
	{
		System.out.println("Oi, eu sou o "+this.Nome);
		System.out.println("Gosto de comida "+this.Preferencia);
		
	}
	
	
}
