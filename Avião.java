package poo;

public class Avi�o {

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
	
		System.out.println("O avi�o j� vai decolar");
		
		else {
			System.out.println("O avi�o n�o pode decolar, verifique o estado atual dele!!!");
		}
	 
	
	}	public void status()
	{
		System.out.println("A cor do avi�o � "+this.cor);
		System.out.println("O modelo do avi�o � "+this.Modelo);
		System.out.println("A quantidade de pessoas que cabe nesse avi�o � "+this.quantidade);
	}
}
