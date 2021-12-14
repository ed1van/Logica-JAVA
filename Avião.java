package poo;

public class Avião {

	String cor;
	String Modelo;
	int quantidade;
	boolean ligado;
	
	void liga()
	{
		ligado=true;
		
	}
	void desligado()
	{
		ligado = false;
	}
	
	public void partida() {
	if(ligado==true)
	
		System.out.println("O avião já vai decolar");
		
		else {
			System.out.println("O avião não pode decolar, verifique o estado atual dele!!!");
		}
	 
	
	}	public void status()
	{
		System.out.println("A cor do avião é "+this.cor);
		System.out.println("O modelo do avião é "+this.Modelo);
		System.out.println("A quantidade de pessoas que cabe nesse avião é "+this.quantidade);
	}
}
